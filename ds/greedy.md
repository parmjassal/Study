Beyond Minimum Spanning Tree (MST) algorithms like Prim’s and Kruskal’s, the **Greedy Method** is a powerful paradigm used in various optimization problems where a locally optimal choice leads to a global solution.

Here is a list of prominent greedy algorithms, their real-world applications, and relevant LeetCode practice links.

---

### 1. Activity Selection (Interval Scheduling)
This algorithm selects the maximum number of activities that can be performed by a single person/machine, given their start and finish times. The greedy choice is to always pick the activity that **finishes earliest**.

* **Applications:** Room scheduling, CPU task scheduling, project management.
* **Practice Links:**
    * [LeetCode 435: Non-overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals/)
    * [LeetCode 452: Minimum Number of Arrows to Burst Balloons](https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/)
    * [LeetCode 646: Maximum Length of Pair Chain](https://leetcode.com/problems/maximum-length-of-pair-chain/)

### 2. Fractional Knapsack
Unlike the 0/1 Knapsack (which requires Dynamic Programming), the Fractional Knapsack allows you to break items into smaller parts. The greedy strategy is to sort items by their **value-to-weight ratio**.

* **Applications:** Resource allocation, logistics (e.g., loading liquid or granular cargo), budget optimization.
* **Practice Links:**
    * [LeetCode 1710: Maximum Units on a Truck](https://leetcode.com/problems/maximum-units-on-a-truck/) (Standard variant)
    * [LeetCode 2279: Maximum Bags With Full Capacity of Rocks](https://leetcode.com/problems/maximum-bags-with-full-capacity-of-rocks/)

### 3. Dijkstra’s Shortest Path Algorithm
Dijkstra's is a greedy algorithm used to find the shortest path from a source node to all other nodes in a weighted graph (with non-negative weights). It greedily picks the unvisited node with the smallest known distance.

* **Applications:** GPS Navigation (Google Maps), Network Routing Protocols (OSPF), social network connections.
* **Practice Links:**
    * [LeetCode 743: Network Delay Time](https://leetcode.com/problems/network-delay-time/)
    * [LeetCode 787: Cheapest Flights Within K Stops](https://leetcode.com/problems/cheapest-flights-within-k-stops/) (Dijkstra variant)
    * [LeetCode 1514: Path with Maximum Probability](https://leetcode.com/problems/path-with-maximum-probability/)

### 4. Huffman Coding
A lossless data compression algorithm. It assigns variable-length codes to input characters, where shorter codes are assigned to more frequent characters. It builds a tree greedily by merging the two nodes with the lowest frequencies.

* **Applications:** File compression (ZIP, GZIP), Multimedia (JPEG, MP3), Telecommunications.
* **Practice Links:**
    * [LeetCode 1167: Minimum Cost to Connect Sticks](https://leetcode.com/problems/minimum-cost-to-connect-sticks/) (Direct implementation of Huffman merging logic)
    * [LeetCode 1046: Last Stone Weight](https://leetcode.com/problems/last-stone-weight/) (Uses similar heap-based greedy logic)

### 5. Job Sequencing with Deadlines
This involves scheduling tasks to maximize profit, where each task has a deadline and a specific profit. The greedy choice is to sort by profit and schedule the most profitable tasks as late as possible (near their deadlines).

* **Applications:** Project deadline management, manufacturing scheduling.
* **Practice Links:**
    * [LeetCode 1353: Maximum Number of Events That Can Be Attended](https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended/)
    * [LeetCode 621: Task Scheduler](https://leetcode.com/problems/task-scheduler/)
    * [LeetCode 1834: Single-Threaded CPU](https://leetcode.com/problems/single-threaded-cpu/)

### 6. Two-Pointer / Greedy Hybrid Problems
Many array problems use greedy logic where you move pointers based on which choice looks "best" right now to reach a global maximum.

* **Applications:** Optimization in array processing, financial analysis.
* **Practice Links:**
    * [LeetCode 11: Container With Most Water](https://leetcode.com/problems/container-with-most-water/)
    * [LeetCode 122: Best Time to Buy and Sell Stock II](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/)
    * [LeetCode 55: Jump Game](https://leetcode.com/problems/jump-game/)

### 7. Other Classic Greedy Problems
* **Lemonade Change:** [LeetCode 860](https://leetcode.com/problems/lemonade-change/) (Greedily giving away the largest bills first).
* **Gas Station:** [LeetCode 134](https://leetcode.com/problems/gas-station/) (Determining the starting point for a circular route).
* **Candy:** [LeetCode 135](https://leetcode.com/problems/candy/) (Distributing candy based on ratings using local comparisons).

---

> **Tip:** Greedy algorithms are often intuitive but hard to prove correct. When practicing, always ask yourself: *"If I make the best choice right now, does it ever prevent me from getting the best overall result later?"* If it does, you likely need **Dynamic Programming** instead.

Would you like a deep dive into the proof or implementation of any of these specifically?
