This table categorizes LeetCode problems that don't just ask you to "sort an array," but instead require you to use the **internal mechanics** of specific sorting algorithms to achieve optimal time or space complexity.

### LeetCode Problems Exploiting Sorting Mechanics

| Problem # | Problem Name | Sorting Property / Algorithm | The "Exploit" (The Why) |
| :--- | :--- | :--- | :--- |
| **315** | [Count of Smaller Numbers After Self](https://leetcode.com/problems/count-of-smaller-numbers-after-self/) | **Merge Sort (Inversion Counting)** | During the `merge` step, when an element from the **right** half is smaller than one from the **left**, it is also smaller than *all* remaining elements in the left half. We "bulk-count" these jumps. |
| **493** | [Reverse Pairs](https://leetcode.com/problems/reverse-pairs/) | **Merge Sort (Divide & Conquer)** | Standard sorting can't handle the $nums[i] > 2 \cdot nums[j]$ condition. We use the sorted halves in the Merge Sort tree to count pairs in $O(n \log n)$ before the merge actually happens. |
| **215** | [Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/) | **Quick Sort (Partitioning)** | Uses **QuickSelect**. By picking a pivot and partitioning, we find the "final position" of one element. We then discard the half that doesn't contain $k$, achieving $O(n)$ average time. |
| **41** | [First Missing Positive](https://leetcode.com/problems/first-missing-positive/) | **Cyclic Sort (Index Mapping)** | Treat the array indices as "buckets" for their values ($nums[i]$ should be at $index = nums[i] - 1$). Swapping elements into their "rightful" homes allows $O(n)$ time with $O(1)$ extra space. |
| **75** | [Sort Colors](https://leetcode.com/problems/sort-colors/) | **Quick Sort (3-Way Partitioning)** | Known as the **Dutch National Flag** algorithm. It exploits the "partition" mechanic to group 0s, 1s, and 2s in a single pass using three pointers. |
| **164** | [Maximum Gap](https://leetcode.com/problems/maximum-gap/) | **Bucket Sort (Pigeonhole Principle)** | To find the max gap in $O(n)$, we distribute numbers into buckets. The gap **must** be larger than the bucket size, meaning we only care about the distance between a bucket's `max` and the next bucket's `min`. |
| **179** | [Largest Number](https://leetcode.com/problems/largest-number/) | **Custom Comparator (Transitivity)** | You redefine "greater than." Instead of comparing $a$ vs $b$, you compare strings $a+b$ vs $b+a$. Sorting then naturally arranges the numbers to form the largest possible total string. |
| **1029** | [Two City Scheduling](https://leetcode.com/problems/two-city-scheduling/) | **Relative Difference Sorting** | You sort by the **opportunity cost** ($priceA - priceB$). This greedy choice, backed by sorting, ensures that people who "save the most" by going to City A are prioritized for City A. |
| **287** | [Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/) | **Cyclic Sort / Linked List Cycle** | Similar to Cyclic Sort, we treat the values as "pointers" to indices. Because there is a duplicate, the "pointers" will eventually enter a cycle (Floyd's Cycle-Finding logic), which is an exploit of the value-index relationship. |
| **451** | [Sort Characters By Frequency](https://leetcode.com/problems/sort-characters-by-frequency/) | **Bucket Sort (Distribution)** | Instead of $O(n \log n)$ sorting, we create "buckets" where the **index** is the frequency. We iterate through buckets from highest to lowest to build the string in $O(n)$. |

---

### Visualizing the Core "Exploits"

#### 1. The Merge Sort "Bulk Count" Exploit
In problems like **315** or **493**, we don't care about the final sorted array as much as we care about the "crossing" of elements during the merge.


#### 2. The Cyclic Sort "Rightful Home" Exploit
Used in **41** and **448**, this treats the array as a self-contained hash map. If a number is $5$, it **must** be at index $4$. If it’s not, we swap it with whatever is currently at index $4$.


#### 3. The QuickSelect "Search Space Reduction" Exploit
In **215** and **973**, we use the partition property to narrow our search. Once the pivot is placed, we know its exact rank. If that rank isn't $k$, we ignore one side of the array entirely.


### Why use these instead of `Array.sort()`?
1.  **Time Complexity:** Problems like **Maximum Gap (164)** or **Kth Largest (215)** require $O(n)$ time. Standard sorting is $O(n \log n)$, which will TLE (Time Limit Exceeded) or fail the interviewer's constraints.
2.  **Space Complexity:** **First Missing Positive (41)** requires $O(1)$ space. Cyclic sort uses the input array as its own storage, whereas most standard sorts require $O(n)$ or $O(\log n)$ recursion depth.
3.  **Special Conditions:** Standard sorting only compares $a < b$. Problems like **Largest Number (179)** or **Reverse Pairs (493)** require comparing relationships that standard sorting doesn't recognize without manual intervention in the sorting logic.

Do you want to see a code implementation for one of these specific "exploits," like the **Merge Sort Inversion** for Count of Smaller Numbers?
