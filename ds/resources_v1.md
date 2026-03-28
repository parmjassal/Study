# 🎯 Google Interview Coding Practice Guide
## Data Structures: Basic to Advanced Levels

---

## 📚 Table of Contents

1. [Essential Books & Resources](#essential-books--resources)
2. [Practice Platforms](#practice-platforms)
3. [Basic Data Structures](#basic-data-structures)
4. [Intermediate Data Structures](#intermediate-data-structures)
5. [Advanced Data Structures](#advanced-data-structures)
6. [Advanced Trees & Self-Balancing Structures](#advanced-trees--self-balancing-structures)
7. [Advanced String Algorithms](#advanced-string-algorithms)
8. [Advanced Graph Algorithms](#advanced-graph-algorithms)
9. [Algorithm Patterns](#algorithm-patterns)
10. [Google-Specific Topics](#google-specific-topics)
11. [Google Hard Problems Table](#google-hard-problems-table)
12. [System Design Basics](#system-design-basics)
13. [Practice Strategy](#practice-strategy)

---

## 📚 Essential Books & Resources

| Resource | Description | Link |
|----------|-------------|------|
| **Cracking the Coding Interview** | The gold standard for interview prep | [Amazon](https://www.amazon.com/Cracking-Coding-Interview-Programming-Questions/dp/0984782850) |
| **Elements of Programming Interviews (EPI)** | In-depth problem-solving guide | [Amazon](https://elementsofprogramminginterviews.com/) |
| **Grokking Algorithms** | Beginner-friendly algorithms book | [Manning](https://www.manning.com/books/grokking-algorithms) |
| **Data Structures and Algorithms Made Easy** | Comprehensive DSA reference | [Amazon](https://www.amazon.in/Data-Structures-Algorithms-Made-Easy/dp/8193245277) |
| **Introduction to Algorithms (CLRS)** | Academic deep-dive | [MIT Press](https://mitpress.mit.edu/books/introduction-algorithms-third-edition) |

---

## 🛠️ Practice Platforms

### Primary Platforms

| Platform | Best For | Link |
|----------|----------|------|
| **LeetCode** | Interview-focused problems, company tags | [leetcode.com](https://leetcode.com/) |
| **GeeksforGeeks** | Theory, explanations, must-do problems | [geeksforgeeks.org](https://www.geeksforgeeks.org/) |
| **HackerRank** | Timed practice, skill tracks | [hackerrank.com](https://www.hackerrank.com/) |
| **HackerEarth** | Basics, CodeMonk articles | [hackerearth.com](https://www.hackerearth.com/) |
| **InterviewBit** | Structured interview prep | [interviewbit.com](https://www.interviewbit.com/) |
| **AlgoExpert** | Visual solutions (paid) | [algoexpert.io](https://www.algoexpert.io/) |
| **AlgoMonster** | Pattern-based learning | [algomaster.io](https://algomaster.io/) |

### Visualization Tools

| Tool | Purpose | Link |
|------|---------|------|
| **VisuAlgo** | Algorithm visualizations | [visualgo.net](https://visualgo.net/) |
| **AlgoMaster DSA Animations** | Animated DSA concepts | [algomaster.io](https://algomaster.io/) |

---

## 🟢 Basic Data Structures

### 1. Arrays

**Concepts:**
- Fixed-size contiguous memory
- O(1) access by index
- O(n) search, insertion, deletion

**Topics to Study:**
- [ ] Array traversal and manipulation
- [ ] Two pointers technique
- [ ] Sliding window
- [ ] Prefix sums
- [ ] Kadane's algorithm (maximum subarray)

**Practice Problems:**
| Problem | Difficulty | Link |
|---------|------------|------|
| Two Sum | Easy | [LeetCode](https://leetcode.com/problems/two-sum/) |
| Best Time to Buy and Sell Stock | Easy | [LeetCode](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) |
| Contains Duplicate | Easy | [LeetCode](https://leetcode.com/problems/contains-duplicate/) |
| Maximum Subarray (Kadane's) | Medium | [LeetCode](https://leetcode.com/problems/maximum-subarray/) |
| Product of Array Except Self | Medium | [LeetCode](https://leetcode.com/problems/product-of-array-except-self/) |
| Find Minimum in Rotated Sorted Array | Medium | [LeetCode](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/) |
| 3Sum | Medium | [LeetCode](https://leetcode.com/problems/3sum/) |
| Container With Most Water | Medium | [LeetCode](https://leetcode.com/problems/container-with-most-water/) |
| Rotate Array | Medium | [LeetCode](https://leetcode.com/problems/rotate-array/) |
| Merge Sorted Arrays | Easy | [LeetCode](https://leetcode.com/problems/merge-sorted-array/) |

**Resources:**
- [GeeksforGeeks Array Questions](https://www.geeksforgeeks.org/array-data-structure/)
- [LeetCode Array Explore Card](https://leetcode.com/explore/learn/card/fun-with-arrays/)

---

### 2. Strings

**Concepts:**
- Character sequences
- Immutable vs mutable strings
- String manipulation and parsing

**Topics to Study:**
- [ ] String traversal
- [ ] Palindrome checking
- [ ] Anagram detection
- [ ] String matching algorithms (KMP, Rabin-Karp)
- [ ] StringBuilder/StringBuffer optimization

**Practice Problems:**
| Problem | Difficulty | Link |
|---------|------------|------|
| Reverse String | Easy | [LeetCode](https://leetcode.com/problems/reverse-string/) |
| Valid Anagram | Easy | [LeetCode](https://leetcode.com/problems/valid-anagram/) |
| Valid Palindrome | Easy | [LeetCode](https://leetcode.com/problems/valid-palindrome/) |
| Longest Substring Without Repeating Characters | Medium | [LeetCode](https://leetcode.com/problems/longest-substring-without-repeating-characters/) |
| Longest Palindromic Substring | Medium | [LeetCode](https://leetcode.com/problems/longest-palindromic-substring/) |
| Palindromic Substrings | Medium | [LeetCode](https://leetcode.com/problems/palindromic-substrings/) |
| Group Anagrams | Medium | [LeetCode](https://leetcode.com/problems/group-anagrams/) |
| Encode and Decode Strings | Medium | [LeetCode](https://leetcode.com/problems/encode-and-decode-strings/) |

**Resources:**
- [GeeksforGeeks String Questions](https://www.geeksforgeeks.org/string-data-structure/)

---

### 3. Matrices (2D Arrays)

**Concepts:**
- Grid representation
- Row/column traversal
- Matrix transformations

**Topics to Study:**
- [ ] Matrix traversal (spiral, diagonal)
- [ ] Matrix rotation
- [ ] Island problems (DFS/BFS on grid)
- [ ] Dynamic programming on grids

**Practice Problems:**
| Problem | Difficulty | Link |
|---------|------------|------|
| Set Matrix Zeroes | Medium | [LeetCode](https://leetcode.com/problems/set-matrix-zeroes/) |
| Spiral Matrix | Medium | [LeetCode](https://leetcode.com/problems/spiral-matrix/) |
| Rotate Image | Medium | [LeetCode](https://leetcode.com/problems/rotate-image/) |
| Number of Islands | Medium | [LeetCode](https://leetcode.com/problems/number-of-islands/) |
| Word Search | Medium | [LeetCode](https://leetcode.com/problems/word-search/) |
| Surrounded Regions | Medium | [LeetCode](https://leetcode.com/problems/surrounded-regions/) |
| Max Area of Island | Medium | [LeetCode](https://leetcode.com/problems/max-area-of-island/) |

---

### 4. Linked Lists

**Concepts:**
- Dynamic size, non-contiguous memory
- Node-based structure with pointers
- Types: Singly, Doubly, Circular

**Topics to Study:**
- [ ] Traversal
- [ ] Insertion and deletion
- [ ] Reversing (iterative & recursive)
- [ ] Cycle detection (Floyd's algorithm)
- [ ] Finding middle element
- [ ] Merging sorted lists

**Practice Problems:**
| Problem | Difficulty | Link |
|---------|------------|------|
| Reverse Linked List | Easy | [LeetCode](https://leetcode.com/problems/reverse-linked-list/) |
| Merge Two Sorted Lists | Easy | [LeetCode](https://leetcode.com/problems/merge-two-sorted-lists/) |
| Linked List Cycle | Easy | [LeetCode](https://leetcode.com/problems/linked-list-cycle/) |
| Remove Nth Node From End | Medium | [LeetCode](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) |
| Middle of Linked List | Easy | [LeetCode](https://leetcode.com/problems/middle-of-the-linked-list/) |
| Reorder List | Medium | [LeetCode](https://leetcode.com/problems/reorder-list/) |
| Add Two Numbers | Medium | [LeetCode](https://leetcode.com/problems/add-two-numbers/) |
| Remove Duplicates from Sorted List | Easy | [LeetCode](https://leetcode.com/problems/remove-duplicates-from-sorted-list/) |
| Find Intersection Point | Easy | [LeetCode](https://leetcode.com/problems/intersection-of-two-linked-lists/) |
| Copy List with Random Pointer | Medium | [LeetCode](https://leetcode.com/problems/copy-list-with-random-pointer/) |

**Resources:**
- [GeeksforGeeks Linked List Questions](https://www.geeksforgeeks.org/data-structures/linked-list/)

---

### 5. Stacks

**Concepts:**
- LIFO (Last In, First Out)
- O(1) push, pop, peek
- Monotonic stack pattern

**Topics to Study:**
- [ ] Basic operations
- [ ] Valid parentheses
- [ ] Next greater element
- [ ] Monotonic stack
- [ ] Expression evaluation

**Practice Problems:**
| Problem | Difficulty | Link |
|---------|------------|------|
| Valid Parentheses | Easy | [LeetCode](https://leetcode.com/problems/valid-parentheses/) |
| Min Stack | Medium | [LeetCode](https://leetcode.com/problems/min-stack/) |
| Evaluate Reverse Polish Notation | Medium | [LeetCode](https://leetcode.com/problems/evaluate-reverse-polish-notation/) |
| Daily Temperatures | Medium | [LeetCode](https://leetcode.com/problems/daily-temperatures/) |
| Next Greater Element I | Easy | [LeetCode](https://leetcode.com/problems/next-greater-element-i/) |
| Largest Rectangle in Histogram | Hard | [LeetCode](https://leetcode.com/problems/largest-rectangle-in-histogram/) |
| Car Fleet | Medium | [LeetCode](https://leetcode.com/problems/car-fleet/) |

---

### 6. Queues

**Concepts:**
- FIFO (First In, First Out)
- O(1) enqueue, dequeue
- Used in BFS, scheduling

**Topics to Study:**
- [ ] Basic operations
- [ ] Circular queue
- [ ] Priority queue
- [ ] Deque
- [ ] Monotonic deque

**Practice Problems:**
| Problem | Difficulty | Link |
|---------|------------|------|
| Implement Queue using Stacks | Easy | [LeetCode](https://leetcode.com/problems/implement-queue-using-stacks/) |
| Design Circular Queue | Medium | [LeetCode](https://leetcode.com/problems/design-circular-queue/) |
| Sliding Window Maximum | Hard | [LeetCode](https://leetcode.com/problems/sliding-window-maximum/) |
| Task Scheduler | Medium | [LeetCode](https://leetcode.com/problems/task-scheduler/) |

---

### 7. Hash Tables / Hash Maps

**Concepts:**
- Key-value pairs
- O(1) average insert/delete/search
- Collision handling

**Topics to Study:**
- [ ] Hash functions
- [ ] Collision resolution (chaining, open addressing)
- [ ] Frequency counting
- [ ] Two Sum pattern

**Practice Problems:**
| Problem | Difficulty | Link |
|---------|------------|------|
| Two Sum | Easy | [LeetCode](https://leetcode.com/problems/two-sum/) |
| Contains Duplicate | Easy | [LeetCode](https://leetcode.com/problems/contains-duplicate/) |
| Happy Number | Easy | [LeetCode](https://leetcode.com/problems/happy-number/) |
| Find All Duplicates in Array | Medium | [LeetCode](https://leetcode.com/problems/find-all-duplicates-in-an-array/) |
| Subarray Sum Equals K | Medium | [LeetCode](https://leetcode.com/problems/subarray-sum-equals-k/) |
| Longest Consecutive Sequence | Medium | [LeetCode](https://leetcode.com/problems/longest-consecutive-sequence/) |
| Group Anagrams | Medium | [LeetCode](https://leetcode.com/problems/group-anagrams/) |

---

## 🟡 Intermediate Data Structures

### 8. Trees

**Concepts:**
- Hierarchical structure
- Root, nodes, leaves
- Traversals: In-order, Pre-order, Post-order, Level-order

**Topics to Study:**
- [ ] Tree traversals (recursive & iterative)
- [ ] Binary Tree properties
- [ ] Binary Search Tree operations
- [ ] Lowest Common Ancestor
- [ ] Tree serialization/deserialization
- [ ] Path sum problems

**Practice Problems:**
| Problem | Difficulty | Link |
|---------|------------|------|
| Maximum Depth of Binary Tree | Easy | [LeetCode](https://leetcode.com/problems/maximum-depth-of-binary-tree/) |
| Validate Binary Search Tree | Medium | [LeetCode](https://leetcode.com/problems/validate-binary-search-tree/) |
| Symmetric Tree | Easy | [LeetCode](https://leetcode.com/problems/symmetric-tree/) |
| Binary Tree Level Order Traversal | Medium | [LeetCode](https://leetcode.com/problems/binary-tree-level-order-traversal/) |
| Convert Sorted Array to BST | Easy | [LeetCode](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/) |
| Lowest Common Ancestor of BST | Easy | [LeetCode](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/) |
| Binary Tree Right Side View | Medium | [LeetCode](https://leetcode.com/problems/binary-tree-right-side-view/) |
| Path Sum | Easy | [LeetCode](https://leetcode.com/problems/path-sum/) |
| Construct Binary Tree from Preorder and Inorder | Medium | [LeetCode](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) |
| Serialize and Deserialize Binary Tree | Hard | [LeetCode](https://leetcode.com/problems/serialize-and-deserialize-binary-tree/) |

**Resources:**
- [GeeksforGeeks Tree Questions](https://www.geeksforgeeks.org/data-structures/trees/)

---

### 9. Heaps (Priority Queues)

**Concepts:**
- Complete binary tree
- Min-heap / Max-heap
- O(log n) insert/delete, O(1) get min/max

**Topics to Study:**
- [ ] Heap operations
- [ ] Heapify
- [ ] Kth largest/smallest elements
- [ ] Merge K sorted lists
- [ ] Top K frequent elements

**Practice Problems:**
| Problem | Difficulty | Link |
|---------|------------|------|
| Kth Largest Element in Array | Medium | [LeetCode](https://leetcode.com/problems/kth-largest-element-in-an-array/) |
| Top K Frequent Elements | Medium | [LeetCode](https://leetcode.com/problems/top-k-frequent-elements/) |
| Merge K Sorted Lists | Hard | [LeetCode](https://leetcode.com/problems/merge-k-sorted-lists/) |
| Find Median from Data Stream | Hard | [LeetCode](https://leetcode.com/problems/find-median-from-data-stream/) |
| Task Scheduler | Medium | [LeetCode](https://leetcode.com/problems/task-scheduler/) |
| Meeting Rooms II | Medium | [LeetCode](https://leetcode.com/problems/meeting-rooms-ii/) |
| Sliding Window Median | Hard | [LeetCode](https://leetcode.com/problems/sliding-window-median/) |

**Resources:**
- [HackerEarth Heap Tutorial](https://www.hackerearth.com/practice/data-structures/trees/heapspriority-queues/tutorial/)

---

### 10. Graphs

**Concepts:**
- Vertices and edges
- Representations: Adjacency List, Adjacency Matrix
- Types: Directed, Undirected, Weighted, Unweighted

**Topics to Study:**
- [ ] Graph representations
- [ ] BFS and DFS traversals
- [ ] Connected components
- [ ] Cycle detection
- [ ] Topological sort
- [ ] Shortest paths (Dijkstra, Bellman-Ford)
- [ ] Minimum Spanning Tree (Kruskal, Prim)

**Practice Problems:**
| Problem | Difficulty | Link |
|---------|------------|------|
| Number of Islands | Medium | [LeetCode](https://leetcode.com/problems/number-of-islands/) |
| Clone Graph | Medium | [LeetCode](https://leetcode.com/problems/clone-graph/) |
| Course Schedule (Topological Sort) | Medium | [LeetCode](https://leetcode.com/problems/course-schedule/) |
| Pacific Atlantic Water Flow | Medium | [LeetCode](https://leetcode.com/problems/pacific-atlantic-water-flow/) |
| Number of Connected Components | Medium | [LeetCode](https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/) |
| Graph Valid Tree | Medium | [LeetCode](https://leetcode.com/problems/graph-valid-tree/) |
| Word Ladder | Hard | [LeetCode](https://leetcode.com/problems/word-ladder/) |
| Dijkstra's Algorithm | Medium | [GeeksforGeeks](https://www.geeksforgeeks.org/dijkstras-shortest-path-algorithm-greedy-algo-7/) |
| Network Delay Time | Medium | [LeetCode](https://leetcode.com/problems/network-delay-time/) |
| Cheapest Flights Within K Stops | Medium | [LeetCode](https://leetcode.com/problems/cheapest-flights-within-k-stops/) |

**Resources:**
- [GeeksforGeeks Graph Questions](https://www.geeksforgeeks.org/graph-data-structure-and-algorithms/)
- [HackerEarth Graph Theory](https://www.hackerearth.com/practice/algorithms/graph-theory/basics/tutorial/)

---

## 🔴 Advanced Data Structures

### 11. Tries (Prefix Trees)

**Concepts:**
- Tree structure for strings
- O(M) insert/search (M = string length)
- Used for autocomplete, word search

**Topics to Study:**
- [ ] Trie node structure
- [ ] Insert, search, delete operations
- [ ] Prefix matching
- [ ] Autocomplete systems
- [ ] Word dictionary

**Practice Problems:**
| Problem | Difficulty | Link |
|---------|------------|------|
| Implement Trie (Prefix Tree) | Medium | [LeetCode](https://leetcode.com/problems/implement-trie-prefix-tree/) |
| Word Search II | Hard | [LeetCode](https://leetcode.com/problems/word-search-ii/) |
| Design Add and Search Words Data Structure | Medium | [LeetCode](https://leetcode.com/problems/design-add-and-search-words-data-structure/) |
| Replace Words | Medium | [LeetCode](https://leetcode.com/problems/replace-words/) |
| Longest Word in Dictionary | Medium | [LeetCode](https://leetcode.com/problems/longest-word-in-dictionary/) |

**Resources:**
- [GeeksforGeeks Trie](https://www.geeksforgeeks.org/trie-insert-and-search/)

---

### 12. Union-Find (Disjoint Set Union)

**Concepts:**
- Dynamic connectivity
- Union and Find operations
- Path compression and union by rank
- Nearly O(1) operations

**Topics to Study:**
- [ ] Disjoint set structure
- [ ] Union by rank
- [ ] Path compression
- [ ] Cycle detection in graphs
- [ ] Connected components

**Practice Problems:**
| Problem | Difficulty | Link |
|---------|------------|------|
| Number of Connected Components | Medium | [LeetCode](https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/) |
| Graph Valid Tree | Medium | [LeetCode](https://leetcode.com/problems/graph-valid-tree/) |
| Number of Islands II | Hard | [LeetCode](https://leetcode.com/problems/number-of-islands-ii/) |
| Accounts Merge | Medium | [LeetCode](https://leetcode.com/problems/accounts-merge/) |
| Redundant Connection | Medium | [LeetCode](https://leetcode.com/problems/redundant-connection/) |
| Most Stones Removed with Same Row or Column | Medium | [LeetCode](https://leetcode.com/problems/most-stones-removed-with-same-row-or-column/) |

**Resources:**
- [HackerEarth Union-Find Tutorial](https://www.hackerearth.com/practice/notes/disjoint-set-union-union-find/)
- [GeeksforGeeks Disjoint Set](https://www.geeksforgeeks.org/disjoint-set-data-structures/)

---

### 13. Segment Trees

**Concepts:**
- Range queries and updates
- O(log n) query and update
- Used for sum, min, max, GCD over ranges

**Topics to Study:**
- [ ] Segment tree construction
- [ ] Range queries
- [ ] Point updates
- [ ] Lazy propagation
- [ ] Persistent segment trees

**Practice Problems:**
| Problem | Difficulty | Link |
|---------|------------|------|
| Range Sum Query - Mutable | Medium | [LeetCode](https://leetcode.com/problems/range-sum-query-mutable/) |
| Range Minimum Query | Hard | [GeeksforGeeks](https://www.geeksforgeeks.org/segment-tree-range-minimum-query/) |
| Count of Smaller Numbers After Self | Hard | [LeetCode](https://leetcode.com/problems/count-of-smaller-numbers-after-self/) |

**Resources:**
- [GeeksforGeeks Segment Tree](https://www.geeksforgeeks.org/segment-tree-data-structure/)

---

### 14. Binary Indexed Tree (Fenwick Tree)

**Concepts:**
- Lightweight alternative to segment tree
- O(log n) prefix sum queries and updates
- Space efficient

**Topics to Study:**
- [ ] BIT construction
- [ ] Prefix sum queries
- [ ] Point updates

**Resources:**
- [GeeksforGeeks Fenwick Tree](https://www.geeksforgeeks.org/binary-indexed-tree-or-fenwick-tree-2/)

---

### 15. LRU Cache

**Concepts:**
- Least Recently Used eviction
- O(1) get and put operations
- Hash map + doubly linked list

**Practice Problems:**
| Problem | Difficulty | Link |
|---------|------------|------|
| LRU Cache | Medium | [LeetCode](https://leetcode.com/problems/lru-cache/) |
| Design LFU Cache | Hard | [LeetCode](https://leetcode.com/problems/lfu-cache/) |

---

## 🌳 Advanced Trees & Self-Balancing Structures

### 16. AVL Trees

**Concepts:**
- Self-balancing binary search tree
- Balance factor: height(left) - height(right) ∈ {-1, 0, 1}
- O(log n) for all operations
- Rotations: Left, Right, Left-Right, Right-Left

**Topics to Study:**
- [ ] Balance factor calculation
- [ ] Single rotations (LL, RR)
- [ ] Double rotations (LR, RL)
- [ ] Insertion with rebalancing
- [ ] Deletion with rebalancing

**Key Operations:**
| Operation | Time Complexity |
|-----------|----------------|
| Search | O(log n) |
| Insert | O(log n) |
| Delete | O(log n) |
| Rotation | O(1) |

**Resources:**
- [GeeksforGeeks AVL Tree](https://www.geeksforgeeks.org/avl-tree-set-1-insertion/)
- [VisuAlgo AVL](https://visualgo.net/en/bst)

---

### 17. Red-Black Trees

**Concepts:**
- Self-balancing BST with color properties
- Every node is red or black
- Root is black, leaves (NIL) are black
- Red nodes have black children
- All paths have same black height
- Used in: Java TreeMap, C++ std::map

**Properties:**
- Height ≤ 2 log₂(n+1)
- Guarantees O(log n) operations
- Fewer rotations than AVL on insert/delete

**Topics to Study:**
- [ ] Red-Black properties
- [ ] Insertion with fixup
- [ ] Deletion with fixup
- [ ] Rotations and recoloring

**Resources:**
- [GeeksforGeeks Red-Black Tree](https://www.geeksforGeeks.org/red-black-tree-set-1-introduction-2/)
- [CLRS Chapter 13]

---

### 18. B-Trees and B+ Trees

**Concepts:**
- Self-balancing tree for disk storage
- Multiple keys per node (order m)
- Used in databases and file systems
- All leaves at same level

**B-Tree Properties:**
- Node has at most m children, at least ⌈m/2⌉
- Root has at least 2 children (if not leaf)
- O(log n) search, insert, delete

**B+ Tree vs B-Tree:**
| Feature | B-Tree | B+ Tree |
|---------|--------|--------|
| Data storage | All nodes | Leaves only |
| Leaf linking | No | Yes (linked list) |
| Duplicate keys | No | Yes (in internal nodes) |
| Use case | General | Database indexing |

**Resources:**
- [GeeksforGeeks B-Tree](https://www.geeksforgeeks.org/b-tree-set-1-introduction-2/)
- [B+ Tree Explained](https://www.geeksforgeeks.org/difference-between-b-tree-and-b-plus-tree/)

---

### 19. Skip Lists

**Concepts:**
- Probabilistic data structure
- Linked list with multiple levels
- O(log n) expected search, insert, delete
- Alternative to balanced trees
- Used in: Redis sorted sets

**Structure:**
- Base level: sorted linked list
- Higher levels: express lanes (skip pointers)
- Probability p for promoting to next level

**Topics to Study:**
- [ ] Level structure
- [ ] Search with skip pointers
- [ ] Insertion with random level
- [ ] Deletion

**Time Complexity:**
| Operation | Expected | Worst Case |
|-----------|----------|------------|
| Search | O(log n) | O(n) |
| Insert | O(log n) | O(n) |
| Delete | O(log n) | O(n) |

**Resources:**
- [GeeksforGeeks Skip List](https://www.geeksforgeeks.org/skip-list/)
- [WilliamFiset Skip List](https://www.youtube.com/watch?v=8Gh9QgQF6k4)

---

### 20. Bloom Filters

**Concepts:**
- Probabilistic space-efficient data structure
- Tests set membership
- Possible false positives, no false negatives
- Uses multiple hash functions

**Properties:**
- Space: O(m bits) where m is filter size
- Uses k hash functions
- False positive rate: (1 - e^(-kn/m))^k

**Operations:**
| Operation | Result |
|-----------|--------|
| Add element | Always succeeds |
| Query element | "Possibly in set" or "Definitely not in set" |

**Use Cases:**
- Web cache filtering
- Spell checkers
- Database query optimization
- Network routers

**Practice Problem:**
| Problem | Difficulty | Link |
|---------|------------|------|
| Design Bloom Filter | Medium | [LeetCode](https://leetcode.com/problems/design-bloom-filter/) |

**Resources:**
- [GeeksforGeeks Bloom Filter](https://www.geeksforgeeks.org/bloom-filters-introduction-and-python-implementation/)

---

## 📝 Advanced String Algorithms

### 21. Suffix Trees & Suffix Arrays

**Suffix Tree Concepts:**
- Compressed trie of all suffixes
- O(n) construction (Ukkonen's algorithm)
- O(m) pattern matching (m = pattern length)

**Suffix Array Concepts:**
- Sorted array of all suffix start indices
- O(n log n) or O(n) construction
- More space-efficient than suffix tree

**Applications:**
- [ ] Longest repeated substring
- [ ] Longest common substring
- [ ] Pattern matching
- [ ] String compression

**Practice Problems:**
| Problem | Difficulty | Link |
|---------|------------|------|
| Longest Duplicate Substring | Hard | [LeetCode](https://leetcode.com/problems/longest-duplicate-substring/) |
| Repeated Substring Pattern | Easy | [LeetCode](https://leetcode.com/problems/repeated-substring-pattern/) |

**Resources:**
- [GeeksforGeeks Suffix Tree](https://www.geeksforgeeks.org/suffix-tree-application-1-pattern-searching/)
- [Suffix Array](https://www.geeksforgeeks.org/suffix-array-set-1-introduction/)

---

### 22. KMP Algorithm (Knuth-Morris-Pratt)

**Concepts:**
- Pattern matching in O(n + m)
- Uses failure function (LPS array)
- Avoids redundant comparisons

**LPS Array (Longest Proper Prefix which is also Suffix):**
- Preprocess pattern in O(m)
- lps[i] = length of longest proper prefix of pattern[0..i] that is also a suffix

**Algorithm Steps:**
1. Build LPS array for pattern
2. Scan text using LPS to skip characters

**Time Complexity:** O(n + m) where n = text length, m = pattern length

**Practice Problems:**
| Problem | Difficulty | Link |
|---------|------------|------|
| Find the Index of the First Occurrence in a String | Easy | [LeetCode](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/) |
| Repeated String Match | Medium | [LeetCode](https://leetcode.com/problems/repeated-string-match/) |

**Resources:**
- [GeeksforGeeks KMP](https://www.geeksforgeeks.org/kmp-algorithm-for-pattern-searching/)

---

### 23. Z-Algorithm

**Concepts:**
- Pattern matching using Z-array
- Z[i] = length of longest substring starting at i that matches prefix
- O(n + m) time complexity

**Z-Array Construction:**
- Maintains a window [L, R] for matching
- Uses previously computed values to avoid recomputation

**Applications:**
- Pattern matching
- Finding all occurrences
- String period detection

**Resources:**
- [GeeksforGeeks Z-Algorithm](https://www.geeksforgeeks.org/z-algorithm-linear-time-pattern-searching-algorithm/)

---

### 24. Manacher's Algorithm

**Concepts:**
- Find longest palindromic substring in O(n)
- Uses palindrome centers and symmetry
- Avoids redundant checks

**Key Ideas:**
- Transform string with separators (handles even/odd)
- Use previously found palindromes to skip checks
- Maintain center and right boundary of current palindrome

**Practice Problems:**
| Problem | Difficulty | Link |
|---------|------------|------|
| Longest Palindromic Substring | Medium | [LeetCode](https://leetcode.com/problems/longest-palindromic-substring/) |
| Palindromic Substrings | Medium | [LeetCode](https://leetcode.com/problems/palindromic-substrings/) |

**Resources:**
- [GeeksforGeeks Manacher's](https://www.geeksforgeeks.org/manachers-algorithm-linear-time-longest-palindromic-substring/)

---

### 25. Rabin-Karp Algorithm

**Concepts:**
- Pattern matching using rolling hash
- O(n + m) average, O(nm) worst case
- Uses modular arithmetic

**Rolling Hash:**
- Hash(s) = Σ(s[i] * p^i) mod m
- Update hash in O(1) when sliding window

**Collision Handling:**
- Use multiple hash functions
- Double-check matches

**Applications:**
- Multiple pattern search
- Plagiarism detection
- 2D pattern matching

**Practice Problems:**
| Problem | Difficulty | Link |
|---------|------------|------|
| Repeated DNA Sequences | Medium | [LeetCode](https://leetcode.com/problems/repeated-dna-sequences/) |

**Resources:**
- [GeeksforGeeks Rabin-Karp](https://www.geeksforgeeks.org/rabin-karp-algorithm-for-pattern-searching/)

---

## 🔗 Advanced Graph Algorithms

### 26. Strongly Connected Components (SCC)

**Tarjan's Algorithm:**
- Single DFS pass
- Uses low-link values
- O(V + E) time complexity
- Identifies SCCs using stack

**Kosaraju's Algorithm:**
- Two DFS passes
- First: compute finish times (topological sort)
- Second: DFS on transposed graph
- O(V + E) time complexity

**Practice Problems:**
| Problem | Difficulty | Link |
|---------|------------|------|
| Critical Connections in a Network | Hard | [LeetCode](https://leetcode.com/problems/critical-connections-in-a-network/) |

**Resources:**
- [GeeksforGeeks Tarjan's SCC](https://www.geeksforgeeks.org/tarjan-algorithm-find-strongly-connectivity-components/)
- [GeeksforGeeks Kosaraju's](https://www.geeksforgeeks.org/strongly-connected-components/)

---

### 27. A* Search Algorithm

**Concepts:**
- Informed search using heuristics
- f(n) = g(n) + h(n)
- g(n): actual cost from start
- h(n): estimated cost to goal (heuristic)
- Optimal if h(n) is admissible (never overestimates)

**Properties:**
- Combines Dijkstra's with greedy best-first
- Uses priority queue
- Optimal and complete with admissible heuristic

**Heuristics:**
- Manhattan distance (grid)
- Euclidean distance
- Chebyshev distance

**Applications:**
- Pathfinding in games
- Robot navigation
- Map routing

**Resources:**
- [GeeksforGeeks A* Search](https://www.geeksforgeeks.org/a-search-algorithm/)

---

### 28. Floyd-Warshall Algorithm

**Concepts:**
- All-pairs shortest paths
- Dynamic programming approach
- O(V³) time, O(V²) space
- Works with negative edges (no negative cycles)

**Algorithm:**
```
for k in range(V):
    for i in range(V):
        for j in range(V):
            dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j])
```

**Applications:**
- Transitive closure
- Finding shortest paths between all pairs
- Detecting negative cycles

**Practice Problems:**
| Problem | Difficulty | Link |
|---------|------------|------|
| Find the City With the Smallest Number of Neighbors at a Threshold Distance | Medium | [LeetCode](https://leetcode.com/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/) |

**Resources:**
- [GeeksforGeeks Floyd-Warshall](https://www.geeksforgeeks.org/floyd-warshall-algorithm-dp-16/)

---

### 29. Bellman-Ford Algorithm

**Concepts:**
- Single-source shortest paths
- Handles negative edge weights
- O(V * E) time complexity
- Detects negative cycles

**Algorithm Steps:**
1. Initialize distances to infinity (source = 0)
2. Relax all edges V-1 times
3. Check for negative cycles (one more iteration)

**Use Cases:**
- Graphs with negative weights
- Currency arbitrage detection
- Network routing

**Practice Problems:**
| Problem | Difficulty | Link |
|---------|------------|------|
| Network Delay Time | Medium | [LeetCode](https://leetcode.com/problems/network-delay-time/) |
| Cheapest Flights Within K Stops | Medium | [LeetCode](https://leetcode.com/problems/cheapest-flights-within-k-stops/) |

**Resources:**
- [GeeksforGeeks Bellman-Ford](https://www.geeksforgeeks.org/bellman-ford-algorithm-dp-23/)

---

## 🧮 Algorithm Patterns

### 1. Two Pointers
**Use when:** Array/string problems, finding pairs, palindromes
**Problems:** Two Sum II, 3Sum, Container With Most Water, Valid Palindrome

### 2. Sliding Window
**Use when:** Subarray/substring problems, contiguous sequences
**Problems:** Longest Substring Without Repeating, Minimum Window Substring, Sliding Window Maximum

### 3. Binary Search
**Use when:** Sorted arrays, finding boundaries, optimization problems
**Problems:** Binary Search, Find Minimum in Rotated Sorted Array, Search in Rotated Sorted Array

### 4. DFS / BFS
**Use when:** Tree/graph traversal, path finding, connected components
**Problems:** Number of Islands, Binary Tree Level Order Traversal, Word Search

### 5. Recursion & Backtracking
**Use when:** Permutations, combinations, constraint satisfaction
**Problems:** Subsets, Permutations, Combination Sum, N-Queens

### 6. Dynamic Programming
**Use when:** Overlapping subproblems, optimal substructure
**Topics:**
- [ ] Memoization (top-down)
- [ ] Tabulation (bottom-up)
- [ ] 1D DP
- [ ] 2D DP
- [ ] Knapsack pattern
- [ ] Longest Common Subsequence
- [ ] Edit Distance

**Practice Problems:**
| Problem | Difficulty | Link |
|---------|------------|------|
| Climbing Stairs | Easy | [LeetCode](https://leetcode.com/problems/climbing-stairs/) |
| Coin Change | Medium | [LeetCode](https://leetcode.com/problems/coin-change/) |
| Longest Increasing Subsequence | Medium | [LeetCode](https://leetcode.com/problems/longest-increasing-subsequence/) |
| Longest Common Subsequence | Medium | [LeetCode](https://leetcode.com/problems/longest-common-subsequence/) |
| Edit Distance | Medium | [LeetCode](https://leetcode.com/problems/edit-distance/) |
| House Robber | Medium | [LeetCode](https://leetcode.com/problems/house-robber/) |
| Unique Paths | Medium | [LeetCode](https://leetcode.com/problems/unique-paths/) |
| Jump Game | Medium | [LeetCode](https://leetcode.com/problems/jump-game/) |
| Partition Equal Subset Sum | Medium | [LeetCode](https://leetcode.com/problems/partition-equal-subset-sum/) |
| Word Break | Medium | [LeetCode](https://leetcode.com/problems/word-break/) |

**Resources:**
- [HackerEarth DP Tutorial](https://www.hackerearth.com/practice/algorithms/dynamic-programming/introduction-to-dynamic-programming-1/tutorial/)

### 7. Greedy Algorithms
**Use when:** Local optimal leads to global optimal
**Problems:** Jump Game, Activity Selection, Minimum Platforms, Task Scheduler

### 8. Divide and Conquer
**Use when:** Problem can be split into independent subproblems
**Problems:** Merge Sort, Quick Sort, Maximum Subarray

---

## 🎯 Google-Specific Topics

### Must-Know for Google Interviews

1. **Big O Notation** - Analyze time and space complexity
2. **Recursion** - Think recursively for tree/graph problems
3. **Bit Manipulation** - Google loves bit tricks
4. **Mathematical Problems** - Number theory, combinatorics
5. **Design Problems** - LRU Cache, Design Twitter, etc.

### Google Frequently Asked Problems

| Problem | Topic | Link |
|---------|-------|------|
| LRU Cache | Design | [LeetCode](https://leetcode.com/problems/lru-cache/) |
| Word Search II | Trie + DFS | [LeetCode](https://leetcode.com/problems/word-search-ii/) |
| Merge K Sorted Lists | Heap | [LeetCode](https://leetcode.com/problems/merge-k-sorted-lists/) |
| Trapping Rain Water | Array | [LeetCode](https://leetcode.com/problems/trapping-rain-water/) |
| Sliding Window Maximum | Deque | [LeetCode](https://leetcode.com/problems/sliding-window-maximum/) |
| Find Median from Data Stream | Heap | [LeetCode](https://leetcode.com/problems/find-median-from-data-stream/) |
| Serialize and Deserialize Binary Tree | Tree | [LeetCode](https://leetcode.com/problems/serialize-and-deserialize-binary-tree/) |

### LeetCode Google Tag
Practice Google-tagged questions on LeetCode Premium: [LeetCode Google Problems](https://leetcode.com/company/google/)

---

## 🔥 Google Hard Problems Table

### Top 14 Hard Problems Frequently Asked at Google

| # | Problem | Topic | Difficulty | LeetCode Link |
|---|---------|-------|------------|---------------|
| 1 | **Trapping Rain Water** | Array/Stack | Hard | [LeetCode](https://leetcode.com/problems/trapping-rain-water/) |
| 2 | **Merge k Sorted Lists** | Heap/Divide & Conquer | Hard | [LeetCode](https://leetcode.com/problems/merge-k-sorted-lists/) |
| 3 | **Word Search II** | Backtracking/Trie | Hard | [LeetCode](https://leetcode.com/problems/word-search-ii/) |
| 4 | **Find Median from Data Stream** | Heap/Design | Hard | [LeetCode](https://leetcode.com/problems/find-median-from-data-stream/) |
| 5 | **Sliding Window Maximum** | Deque/Sliding Window | Hard | [LeetCode](https://leetcode.com/problems/sliding-window-maximum/) |
| 6 | **Serialize and Deserialize Binary Tree** | Tree/Design | Hard | [LeetCode](https://leetcode.com/problems/serialize-and-deserialize-binary-tree/) |
| 7 | **LFU Cache** | Design/Hash Map | Hard | [LeetCode](https://leetcode.com/problems/lfu-cache/) |
| 8 | **Word Ladder** | BFS/Graph | Hard | [LeetCode](https://leetcode.com/problems/word-ladder/) |
| 9 | **Alien Dictionary** | Topological Sort | Hard | [LeetCode](https://leetcode.com/problems/alien-dictionary/) |
| 10 | **Critical Connections in a Network** | Graph/Tarjan's | Hard | [LeetCode](https://leetcode.com/problems/critical-connections-in-a-network/) |
| 11 | **Range Sum Query 2D - Mutable** | Segment Tree | Hard | [LeetCode](https://leetcode.com/problems/range-sum-query-2d-mutable/) |
| 12 | **Count of Smaller Numbers After Self** | BIT/Segment Tree | Hard | [LeetCode](https://leetcode.com/problems/count-of-smaller-numbers-after-self/) |
| 13 | **Longest Duplicate Substring** | Suffix Array/Binary Search | Hard | [LeetCode](https://leetcode.com/problems/longest-duplicate-substring/) |
| 14 | **Minimum Window Substring** | Sliding Window/Hash Map | Hard | [LeetCode](https://leetcode.com/problems/minimum-window-substring/) |

### Tips for Hard Problems

1. **Start with brute force** - Then optimize step by step
2. **Identify the pattern** - Most hard problems combine 2+ patterns
3. **Draw it out** - Visualize the problem
4. **Think about data structures** - What DS makes operations efficient?
5. **Consider edge cases** - Empty input, single element, duplicates

---

## 🏗️ System Design Basics

### Core Concepts for Google System Design Interviews

#### 1. Scalability Fundamentals

| Concept | Description |
|---------|-------------|
| **Vertical Scaling** | Increase power of single machine |
| **Horizontal Scaling** | Add more machines |
| **Load Balancing** | Distribute traffic across servers |
| **Caching** | Store frequently accessed data in fast storage |
| **Database Sharding** | Split data across multiple databases |

#### 2. CAP Theorem

- **Consistency**: All nodes see same data at same time
- **Availability**: Every request gets a response
- **Partition Tolerance**: System works despite network failures
- **Trade-off**: Can only guarantee 2 of 3

| System Type | Prioritizes |
|-------------|-------------|
| **CA** | Consistency + Availability (RDBMS) |
| **CP** | Consistency + Partition Tolerance (HBase, MongoDB) |
| **AP** | Availability + Partition Tolerance (Cassandra, DynamoDB) |

#### 3. Common System Design Problems

| Problem | Key Concepts |
|---------|--------------|
| **Design URL Shortener** | Hashing, Base62 encoding, Caching |
| **Design Pastebin** | Key generation, Expiration, Access control |
| **Design Instagram** | Sharding, Feed generation, CDNs |
| **Design Twitter** | Fan-out vs Pull, Timeline, Search |
| **Design YouTube** | Video processing, CDNs, Thumbnails |
| **Design Web Crawler** | BFS, Politeness, Deduplication |
| **Design Rate Limiter** | Token bucket, Sliding window, Redis |
| **Design Chat System** | WebSockets, Message ordering, Presence |

#### 4. Database Types

| Type | Examples | Use Case |
|------|----------|----------|
| **Relational (RDBMS)** | MySQL, PostgreSQL | Structured data, ACID transactions |
| **Key-Value** | Redis, DynamoDB | Caching, Session storage |
| **Document** | MongoDB, CouchDB | Semi-structured data, Flexible schema |
| **Column-family** | Cassandra, HBase | Time-series, Heavy writes |
| **Graph** | Neo4j | Social networks, Recommendations |

#### 5. Consistency Patterns

| Pattern | Description |
|---------|-------------|
| **Strong Consistency** | Synchronous replication, slower reads |
| **Eventual Consistency** | Async replication, faster reads |
| **Read-your-writes** | User sees their own updates immediately |

#### 6. Caching Strategies

| Strategy | Description |
|----------|-------------|
| **Cache-aside** | Application manages cache and DB |
| **Write-through** | Write to cache and DB simultaneously |
| **Write-back** | Write to cache, async to DB |
| **Write-around** | Write directly to DB, cache on read |

#### 7. Message Queues

- **Purpose**: Decouple services, handle async tasks
- **Examples**: Kafka, RabbitMQ, SQS
- **Patterns**: Point-to-point, Pub/Sub

#### 8. System Design Framework (RESHA)

| Step | Description |
|------|-------------|
| **R**equirements | Clarify functional and non-functional requirements |
| **E**stimation | Estimate scale, storage, bandwidth |
| **S**torage | Define data model and storage schema |
| **H**igh-level | Design main components and connections |
| **A**pproach deep-dive | Detail critical components |

### Recommended Resources

- [System Design Primer](https://github.com/donnemartin/system-design-primer)
- [Grokking the System Design Interview](https://www.educative.io/courses/grokking-the-system-design-interview)
- [Designing Data-Intensive Applications](https://www.oreilly.com/library/view/designing-data-intensive-applications/9781491903063/)

---

## 📋 Practice Strategy

### Phase 1: Foundation (1-2 months)
- Master core structures: Arrays, Strings, Linked Lists, Stacks, Queues
- Learn basic algorithms: Sorting, Searching, Recursion
- **Resource:** GeeksforGeeks for theory, implement every concept yourself

### Phase 2: Pattern Recognition (2-3 months)
- Learn patterns: Sliding Window, Two Pointers, DFS/BFS, DP
- Solve 100-200 problems by pattern
- **Resource:** LeetCode Explore Cards, AlgoMonster patterns

### Phase 3: Advanced Topics (1-2 months)
- Trees, Graphs, Heaps, Tries
- Advanced DP, Union-Find, Segment Trees
- **Resource:** LeetCode Medium/Hard problems

### Phase 4: Mock Interviews (Ongoing)
- Timed practice (45 min per problem)
- Explain your approach out loud
- Practice whiteboarding
- **Resource:** LeetCode Contests, Pramp, interviewing.io

### Daily Practice Routine
```
Morning (1 hour):
- Review 1 concept/theory
- Solve 2 Easy problems (warm-up)

Afternoon (1-2 hours):
- Solve 1-2 Medium problems
- Focus on 1 pattern per week

Evening (30 min):
- Review solutions
- Maintain a problem journal
```

### Tips for Success

1. **Don't memorize code** - Understand the pattern and logic
2. **Clarify before coding** - Ask about constraints and edge cases
3. **Think out loud** - Communication is as important as the solution
4. **Start with brute force** - Then optimize
5. **Dry run your code** - Test with examples before submitting
6. **Track your progress** - Use a spreadsheet or Notion

---

## 📊 Topic Priority Matrix

| Topic | Priority | Estimated Time |
|-------|----------|----------------|
| Arrays | 🔴 High | 1 week |
| Strings | 🔴 High | 1 week |
| Hash Tables | 🟡 Medium | 3-4 days |
| Linked Lists | 🟡 Medium | 3-4 days |
| Stacks & Queues | 🟡 Medium | 3-4 days |
| Trees | 🔴 High | 1-2 weeks |
| Graphs | 🔴 High | 1-2 weeks |
| Heaps | 🟡 Medium | 3-4 days |
| Dynamic Programming | 🔴 High | 2 weeks |
| Tries | 🟡 Medium | 2-3 days |
| Union-Find | 🟢 Low | 2-3 days |
| Segment Trees | 🟢 Low | 2-3 days |
| Advanced Trees (AVL, RB) | 🟢 Low | 2-3 days |
| Advanced String Algorithms | 🟢 Low | 2-3 days |
| Advanced Graph Algorithms | 🟢 Low | 2-3 days |
| System Design | 🟡 Medium | 1-2 weeks |

---

## 🔗 Additional Resources

### GitHub Repositories
- [Awesome LeetCode Resources](https://github.com/ashishps1/awesome-leetcode-resources)
- [LeetCode Patterns](https://github.com/Seanforfun/Algorithm-and-Leetcode)

### YouTube Channels
- [NeetCode](https://www.youtube.com/c/NeetCode)
- [Tech Dose](https://www.youtube.com/c/Techdose)
- [Abdul Bari](https://www.youtube.com/channel/UCZCJT11u4-be4LxDiHnPPQ)
- [WilliamFiset](https://www.youtube.com/c/WilliamFiset-algorithms)

### Interview Handbooks
- [Tech Interview Handbook](https://www.techinterviewhandbook.org/)
- [Blind 75 Questions](https://www.techinterviewhandbook.org/grind75)

---

## ✅ Checklist Before Google Interview

- [ ] Solved 150+ LeetCode problems
- [ ] Comfortable with all basic data structures
- [ ] Can explain time/space complexity for solutions
- [ ] Practiced coding on whiteboard/doc
- [ ] Done 5+ mock interviews
- [ ] Reviewed Google-specific problems
- [ ] Reviewed Google Hard Problems table
- [ ] Understand system design basics
- [ ] Prepared behavioral stories (STAR format)

---

**Good luck with your Google interview preparation! 🚀**

*Last Updated: 2025*
