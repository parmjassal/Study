# Technical Design Document Writing Exercises
## Based on Amazon Six-Pager Guidelines

---

## Overview

These exercises are designed to practice writing technical design documents following Amazon's internal documentation guidelines. Each exercise presents a **component feature** that is part of a larger system, requiring you to write a comprehensive technical design document.

### Amazon Technical Document Guidelines Summary

- **Length**: 6-8 pages of primary content (appendix has no limit)
- **Style**: Narrative prose, minimize bullet points
- **Data**: Use specific numbers, percentages, dates - no weasel words
- **Structure**: The document must be self-sufficient

### Required Sections for Each Exercise

1. **Introduction** (~0.5 pages): Context and purpose
2. **Problem Statement** (~0.5 pages): Clear problem definition
3. **Goals** (~0.5 pages): Measurable success metrics
4. **Tenets** (~0.5 pages): Guiding principles
5. **Technical Design** (2-3 pages): Architecture, components, data structures, interfaces
6. **Risks and Mitigations** (~0.5 pages): Identified risks with solutions
7. **Appendix**: Supporting diagrams, data, methodologies

---

## Exercise 1: Rate Limiter Component for API Gateway

### Context
You are a Senior Engineer on the **API Gateway Platform Team**. Your team owns the company's centralized API Gateway that handles 2.5 million requests per minute across 150+ internal services. The platform serves both internal microservices and external partner APIs.

### The Bigger Feature
The API Gateway platform provides unified request routing, authentication, monitoring, and traffic management for all services. It is a critical piece of infrastructure that ensures system reliability and security.

### Your Component Feature
Design a **Rate Limiter Component** that will be integrated into the API Gateway to protect downstream services from traffic spikes and enforce fair usage policies.

### Requirements
- Support multiple rate limiting algorithms (token bucket, sliding window, fixed window)
- Handle per-client, per-endpoint, and global rate limits
- Sub-millisecond latency overhead
- High availability (99.99% uptime)
- Configurable without gateway restarts
- Audit logging for rate limit violations

### Your Task
Write a complete technical design document for the Rate Limiter Component following Amazon's six-pager format. Your document should cover the problem, solution architecture, data structures, APIs, integration points with the existing gateway, and operational considerations.

---

## Exercise 2: Caching Layer for User Profile Service

### Context
You are a Staff Engineer on the **User Identity Platform Team**. Your team manages the User Profile Service that stores and serves profile data for 45 million active users. The service currently handles 80,000 reads per second and 5,000 writes per second, with p99 latency of 120ms for read operations.

### The Bigger Feature
The User Profile Service is part of the larger User Identity Platform, which manages authentication, authorization, profile management, and preference storage. This platform is foundational to all user-facing applications.

### Your Component Feature
Design a **Caching Layer** that will reduce read latency and database load while maintaining data consistency with profile updates.

### Requirements
- Reduce p99 read latency to under 20ms
- Support cache invalidation within 100ms of profile updates
- Handle 10:1 read-to-write ratio
- Multi-region cache synchronization
- Graceful degradation if cache fails
- Memory efficiency (target <50GB total cache footprint)
- Support for partial profile caching (field-level)

### Your Task
Write a complete technical design document for the Caching Layer following Amazon's six-pager format. Address cache architecture, invalidation strategies, consistency models, failure scenarios, and integration with the existing profile service.

---

## Exercise 3: Audit Logging System for Payment Processing

### Context
You are a Principal Engineer on the **Payments Platform Team**. Your team processes $2.8 billion in transactions annually across 12 payment methods and 35 countries. The platform must comply with PCI-DSS, SOX, and regional financial regulations.

### The Bigger Feature
The Payment Processing Platform handles the complete transaction lifecycle: authorization, capture, settlement, refunds, and dispute management. It integrates with 25+ external payment providers and internal financial systems.

### Your Component Feature
Design an **Audit Logging System** that captures, stores, and provides queryable access to all payment-related events for compliance, debugging, and forensic analysis.

### Requirements
- Immutable audit trail with cryptographic integrity verification
- Capture 500+ event types across the payment lifecycle
- Retain data for 7 years (regulatory requirement)
- Query response time under 5 seconds for 90-day lookups
- Support real-time alerting on suspicious patterns
- Zero data loss (durability guarantee)
- Partitioned by tenant and time for efficient archival
- Export capabilities for regulatory audits

### Your Task
Write a complete technical design document for the Audit Logging System following Amazon's six-pager format. Cover the logging architecture, storage strategy, integrity mechanisms, query capabilities, compliance considerations, and operational procedures.

---

## Evaluation Criteria

When reviewing your technical design documents, consider:

1. **Clarity of Problem Statement**: Is the problem well-defined with specific metrics?
2. **Technical Depth**: Does the design show understanding of trade-offs and alternatives?
3. **Completeness**: Are all major components, interfaces, and data flows addressed?
4. **Operational Readiness**: Are monitoring, alerting, and failure scenarios covered?
5. **Narrative Quality**: Is it written as cohesive prose with minimal bullets?
6. **Data-Driven**: Are specific numbers and metrics used throughout?
7. **Self-Sufficient**: Can a new team member understand the design without external context?

---

## References

- Amazon Six-Pager Guidelines: Narrative-style documents with 6-8 pages of primary content
- Technical Design Focus: Architecture diagrams, data structures, interfaces, algorithms
- Writing Style: Prose over bullets, specific metrics over weasel words
- Document Structure: Introduction → Problem → Goals → Tenets → Design → Risks → Appendix
