# Revision Notes: Global High-Throughput Rate Limiter

This document summarizes the iterative design process for a scalable, production-grade Rate Limiter, specifically optimized for high-volume multi-tenant environments.

---

## 1. Problem Statement & Scale
* **Goal:** Protect downstream services from being overwhelmed by specific tenants or general traffic surges.
* **Initial Scale:** 1,000 RPS.
* **5-Year Projection:** 1,600 RPS (10% CAGR).
* **Correction (The "Real" Scale):** Based on 1 Billion requests/day, the average load is **~11,500 RPS**, with peaks likely hitting **30,000+ RPS**.

### Back-of-the-Envelope (BoE) Calculations
* **Total Tenants:** $1 \times 10^6$ (1 Million).
* **Storage per Tenant:** 24 bytes (Counter + Last Timestamp + Metadata).
* **Total Memory Footprint:** $\approx 24 \text{ MB}$.
    * *Insight:* Memory is not the bottleneck; **Throughput (CPU/Network)** is.
* **Throughput Target:** 11.5k RPS (Average) $\rightarrow$ 30k RPS (Peak).

---

## 2. Final Architecture Overview



The system uses a **Sidecar Pattern** to offload rate-limiting logic from the application code, coupled with a **Distributed Redis Layer** for atomic global counting.

### A. The Data Plane (Request Path)
1.  **Sidecar Local Cache:** Stores configuration (limits/thresholds).
    * **Optimization:** TTL is driven by $P_{50}$ inter-arrival time (based on observability) to maximize hit rates while keeping memory lean.
2.  **Request Batching:** To protect Redis from "Hot Key" scenarios, requests are buffered locally.
    * **Threshold:** Batch of **5 requests** or **50ms linger time**.
3.  **Redis Lua Scripts:** Executes `INCRBY` atomically.
    * **Logic:** Refill tokens $\rightarrow$ Check threshold $\rightarrow$ Increment $\rightarrow$ Return "Allowed/Blocked."

### B. The Control Plane (Config Path)
1.  **Source of Truth:** DynamoDB stores tenant-specific overrides and API defaults.
2.  **Config Distribution:**
    * DynamoDB exports to **S3** (Versioned JSON/YAML).
    * Sidecars poll S3 every 5 seconds.
    * **Safety:** Uses **Jitter** to prevent "Thundering Herd" and `If-Modified-Since` tags to save bandwidth.

---

## 3. The Iterative Design Process (Interview Gaps)

| Gap Identified | Proposed Solution | Why it matters |
| :--- | :--- | :--- |
| **Hot Key Problem** | Local Batching (5x) | Prevents a single Redis shard from melting under one "Whale" tenant's traffic. |
| **Cache Staleness** | $P_{50}$ Telemetry-driven TTL | Optimizes RAM for millions of tenants while keeping active ones "Hot." |
| **Race Conditions** | Redis Lua Scripts | Ensures atomic "Read-Modify-Write" cycles in a single round trip. |
| **System Outage** | Fail-Open ("Is Allowed") | A rate limiter should not be a single point of failure for the whole ecosystem. |
| **Slow Propagation** | Emergency Admin API/CLI | Bypasses the 5s S3 poll to inject a block directly into Redis with priority. |

---

## 4. Operational & Emergency Strategy

### The "Break-Glass" CLI
* **Implementation:** A CLI tool built on the same codebase as the service to ensure identical **Shard Hashing logic**.
* **Deployment:** Runs on a Bastion host/Admin pod.
* **Execution:** Injects a key with a specific prefix (e.g., `EMERGENCY_BLOCK:<tenantId>`) into Redis.
* **Priority:** The Lua script checks for the emergency key *first*. If it exists, it ignores the standard config.
* **Cleanup:** Injected keys have a short **TTL** (e.g., 1 hour) to ensure automatic revert if human intervention is forgotten.



---

## 5. Summary of Staff-Level Trade-offs

* **Consistency vs. Latency:** We chose **Eventual Consistency** for replicas and **Atomic Local Consistency** (Lua) for shards to ensure sub-millisecond response times.
* **Accuracy vs. Performance:** By batching requests (5x), we accept a ~0.5% margin of error in exchange for a 5x increase in Redis throughput.
* **Pull vs. Push:** Used a **Pull model (S3)** for scalability/resilience, supplemented by a **Manual Push (CLI)** for emergency speed.



---
**Revision Checklist:**
- [ ] Can you explain why Lua is better than Multi/Exec? (Atomicity + Logic).
- [ ] Why S3 instead of direct DB hits? (Resilience + Caching at Edge).
- [ ] How does $P_{50}$ inter-arrival time save costs? (Self-tuning eviction).
- [ ] Why shared sharding logic in the CLI? (Correctly targeting the Redis Master).
