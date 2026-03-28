# Algorithm Resources: Two Pointers, Sliding Window & Monotonic Techniques

> **Target Difficulty**: Medium to Hard
> **Focus**: Interview preparation and pattern recognition

---

## 📌 Table of Contents

1. [Two Pointers Technique](#1-two-pointers-technique)
2. [Sliding Window Technique](#2-sliding-window-technique)
3. [Monotonic Stack/Deque](#3-monotonic-stackdeque)
4. [Combined Pattern Recognition](#4-combined-pattern-recognition)

---

## 1. Two Pointers Technique

### 🎯 When to Use
- Array/String is **sorted** or can be sorted
- Finding **pairs/triplets** that satisfy a condition
- Problems involving **palindromes** or symmetry
- Need to reduce O(n²) to O(n)

### 📚 Key Resources

| Resource | Type | Link |
|----------|------|------|
| Top Problems on Two Pointers for Interviews | Guide | [GeeksforGeeks](https://www.geeksforgeeks.org/dsa/top-problems-on-two-pointers-technique-for-interviews/) |
| Two-Pointer Overview | Tutorial | [Hello Interview](https://www.hellointerview.com/learn/code/two-pointers/overview) |
| Two Pointers in 7 minutes | Video | [YouTube](https://www.youtube.com/watch?v=QzZ7nmouLTI) |
| Solving All Two Pointer Pattern (Blind75) | Video | [YouTube](https://www.youtube.com/watch?v=6lX7x1RcLvg) |
| Pattern 2: Two Pointer | GitHub | [GitHub Repo](https://github.com/Chanda-Abdul/Several-Coding-Patterns-for-Solving-Data-Structures-and-Algorithms-Problems-during-Interviews/blob/main/%E2%9C%85%20%20Pattern%2002:%20Two%20Pointers.md) |

### 🏋️ Practice Problems

#### Medium Difficulty

| Problem | Platform | Key Concept |
|---------|----------|-------------|
| **Container With Most Water** | LeetCode #11 | Opposite pointers, maximize area |
| **3Sum** | LeetCode #15 | Triplet sum, eliminate duplicates |
| **Triangle Numbers** | LeetCode | Sorted array, valid triangle |
| **Count pairs with absolute difference K** | GeeksforGeeks | Pair counting |
| **Triplet Sum in Array** | GeeksforGeeks | 3Sum variant |
| **K-th element of two Arrays** | GeeksforGeeks | Merge two sorted arrays |
| **Union of 2 Sorted Arrays with Duplicates** | GeeksforGeeks | Merge technique |
| **Subarrays with Max in Range** | GeeksforGeeks | Range constraints |
| **Longest Substring with K Unique Characters** | GeeksforGeeks | Two pointers + hash map |
| **The Celebrity Problem** | GeeksforGeeks | Elimination technique |
| **Sort Colors** | LeetCode #75 | Dutch National Flag |
| **Move Zeroes** | LeetCode #283 | Parallel pointers |

#### Hard Difficulty

| Problem | Platform | Key Concept |
|---------|----------|-------------|
| **Trapping Rain Water** | LeetCode #42 | Opposite pointers, water level |
| **4Sum** | LeetCode #18 | Quadruple sum |
| **4Sum - All Distinct Quadruplets** | GeeksforGeeks | Unique quadruplets with target sum |
| **Median of Two Sorted Arrays** | LeetCode #4 | Binary search + two pointers |
| **Remove and Reverse** | GeeksforGeeks | Complex manipulation |

### 🔑 Two Pointer Types

1. **Opposite Direction**: Pointers start at opposite ends, move toward each other
   - Use for: Palindromes, Container With Most Water, Two Sum (sorted)

2. **Parallel/Same Direction**: Both pointers start at same end, move together
   - Use for: Move Zeroes, Remove Duplicates, Sort Colors

---

## 2. Sliding Window Technique

### 🎯 When to Use
- Finding **subarrays/substrings** with specific properties
- **Optimization** problems (max/min length, sum, count)
- **Fixed-size** or **variable-size** window problems
- Need to avoid recomputing overlapping subarrays

### 📚 Key Resources

| Resource | Type | Link |
|----------|------|------|
| Sliding Window Cheatsheet with Categorized Problems | Guide | [Reddit/LeetCode](https://www.reddit.com/r/leetcode/comments/1lnujcc/sliding_window_cheatsheet_with_categorized/) |
| Sliding Window Summary with Practice Questions | Blog | [Medium](https://medium.com/@maityamit/sliding-window-summary-with-practice-questions-sheet-c-on-leetcode-7e275b4ed194) |
| Sliding Window Technique: Comprehensive Guide | Guide | [LeetCode Discuss](https://leetcode.com/discuss/post/3722472/sliding-window-technique-a-comprehensive-ix2k/) |
| Sliding Window Problem List | Official List | [LeetCode](https://leetcode.com/problem-list/sliding-window/) |
| Overcoming Sliding Window Fear | Motivation | [Reddit](https://www.reddit.com/r/leetcode/comments/123f2ly/i_used_to_be_afraid_of_the_sliding_window/) |

### 🏋️ Practice Problems

#### Constant Size Window (Medium)

| Problem | Platform | Key Concept |
|---------|----------|-------------|
| **Maximum Sum Subarray of Size K** | Generic | Fixed window sum |
| **Find All Anagrams in a String** | LeetCode #438 | Fixed window + frequency map |
| **Permutation in String** | LeetCode #567 | Fixed window matching |
| **Sliding Window Maximum** | LeetCode #239 | Deque + monotonic |
| **Sliding Window Median** | LeetCode #480 | Two heaps |

#### Variable Size Window (Medium-Hard)

| Problem | Platform | Key Concept |
|---------|----------|-------------|
| **Minimum Size Subarray Sum** | LeetCode #209 | Shrink from left |
| **Longest Substring Without Repeating Characters** | LeetCode #3 | Expand + shrink |
| **Longest Substring with At Most K Distinct Characters** | LeetCode #340 | Frequency map |
| **Longest Substring with At Least K Repeating Characters** | LeetCode #395 | Divide and conquer |
| **Subarrays with K Different Integers** | LeetCode #992 | AtMost(K) - AtMost(K-1) |
| **Max Consecutive Ones III** | LeetCode #1004 | Zero counter |
| **Fruit Into Baskets** | LeetCode #904 | At most 2 types |
| **Minimum Window Substring** | LeetCode #76 | Hard - template matching |

#### Hard Difficulty

| Problem | Platform | Key Concept |
|---------|----------|-------------|
| **Minimum Window Substring** | LeetCode #76 | Smallest window containing all chars |
| **Substring with Concatenation of All Words** | LeetCode #30 | Multiple word matching |
| **Smallest Range Covering Elements from K Lists** | LeetCode #632 | Multi-pointer sliding window |
| **Count Subarrays with Score Less Than K** | LeetCode #2302 | Binary search + prefix sum |

### 🔑 Sliding Window Patterns

```cpp
// Pattern 1: Fixed Size Window
int left = 0, sum = 0;
for (int i = 0; i < n; i++) {
    sum += arr[i];
    if (i >= k - 1) {
        // Process window [left, i]
        sum -= arr[left++];
    }
}

// Pattern 2: Variable Size Window (shrink condition)
int left = 0;
for (int i = 0; i < n; i++) {
    // Add element at i
    while (/* invalid window condition */) {
        // Remove element at left
        left++;
    }
    // Update answer
}
```

---

## 3. Monotonic Stack/Deque

### 🎯 When to Use
- Finding **next/previous greater/smaller element**
- Problems involving **spans, ranges, or boundaries**
- Need O(n) instead of O(n²) for comparison problems
- **Sliding window maximum/minimum** (monotonic deque)
- Avoiding nested loops for element comparisons

### 📚 Key Resources

| Resource | Type | Link |
|----------|------|------|
| Monotonic Stack/Deque Guide | Official Guide | [LeetCode Discuss](https://leetcode.com/discuss/general-discussion/1061744/topic-2-monotonic-stack-or-deque/) |
| Monotonic Stack Problem List | Official List | [LeetCode](https://leetcode.com/problem-list/monotonic-stack/) |
| Understanding Monotonic Stack for Interviews | Article | [LinkedIn](https://www.linkedin.com/posts/neetcodeio_what-is-a-monotonic-stack-activity-7369746157385728002-zbyv) |
| Monotonic Queue/Deque Questions | Discussion | [Reddit](https://www.reddit.com/r/leetcode/comments/1fapuse/questions_which_utilize_monotonic_queuedeque/) |

### 🏋️ Practice Problems

#### Medium Difficulty

| Problem | Platform | Key Concept |
|---------|----------|-------------|
| **Next Greater Element I** | LeetCode #496 | Monotonic decreasing stack |
| **Next Greater Element II** | LeetCode #503 | Circular array |
| **Daily Temperatures** | LeetCode #739 | Next greater to right |
| **Online Stock Span** | LeetCode #901 | Previous greater element |
| **Car Fleet** | LeetCode #853 | Sort + monotonic stack |
| **Asteroid Collision** | LeetCode #735 | Stack simulation |
| **Remove K Digits** | LeetCode #402 | Monotonic increasing stack |
| **Find the Most Competitive Subsequence** | LeetCode #1673 | Smallest subsequence |

#### Hard Difficulty

| Problem | Platform | Key Concept |
|---------|----------|-------------|
| **Largest Rectangle in Histogram** | LeetCode #84 | Previous smaller + next smaller |
| **Maximal Rectangle** | LeetCode #85 | Histogram per row |
| **Trapping Rain Water** | LeetCode #42 | Monotonic stack approach |
| **Sliding Window Maximum** | LeetCode #239 | Monotonic deque |
| **Sum of Subarray Minimums** | LeetCode #907 | Contribution counting |
| **Sum of Subarray Ranges** | LeetCode #2104 | Max - Min contribution |
| **Number of Visible People in a Queue** | LeetCode #1944 | Next greater with count |
| **Build Buildings With an Ocean View** | LeetCode #1762 | Next greater from right |
| **Max Chunks To Make Sorted II** | LeetCode #768 | Max so far comparison |

### 🔑 Monotonic Stack Types

1. **Monotonic Increasing Stack**: Elements are non-decreasing
   - Use for: Next smaller element, Remove K Digits
   - Pop elements greater than current before pushing

2. **Monotonic Decreasing Stack**: Elements are non-increasing
   - Use for: Next greater element, Daily Temperatures
   - Pop elements smaller than current before pushing

```cpp
// Monotonic Decreasing Stack (Next Greater Element)
stack<int> st;
vector<int> result(n, -1);
for (int i = 0; i < n; i++) {
    while (!st.empty() && nums[st.top()] < nums[i]) {
        result[st.top()] = nums[i];
        st.pop();
    }
    st.push(i);
}
```

---

## 4. Combined Pattern Recognition

### 🧠 Decision Flowchart

```
Is the array sorted?
├── Yes → Consider: Binary Search, Two Pointers, Prefix Sums
└── No → Is it an optimization problem (max/min/subarray)?
         ├── Yes → Consider: Sliding Window, DP, Greedy
         │         ├── Fixed size? → Sliding Window
         │         └── Variable size? → Sliding Window + condition
         └── No → Looking for next/prev greater/smaller?
                  ├── Yes → Monotonic Stack
                  └── No → Looking for duplicates/frequencies?
                           └── Yes → HashMap, HashSet
```

### 🔗 Problems Using Multiple Techniques

| Problem | Techniques | Difficulty |
|---------|------------|------------|
| **Trapping Rain Water** | Two Pointers OR Monotonic Stack OR DP | Hard |
| **Sliding Window Maximum** | Sliding Window + Monotonic Deque | Hard |
| **Longest Substring with K Unique** | Two Pointers + HashMap | Medium |
| **Minimum Window Substring** | Sliding Window + Two Pointers | Hard |
| **Container With Most Water** | Two Pointers (Opposite) | Medium |
| **Largest Rectangle in Histogram** | Monotonic Stack (both directions) | Hard |

---

## 📝 Quick Reference Cheat Sheet

| Pattern | Time Complexity | Space Complexity | Key Indicator |
|---------|-----------------|------------------|---------------|
| Two Pointers | O(n) | O(1) | Sorted array, pairs, palindrome |
| Sliding Window (Fixed) | O(n) | O(1) or O(k) | Fixed subarray size |
| Sliding Window (Variable) | O(n) | O(k) | Min/max subarray length |
| Monotonic Stack | O(n) | O(n) | Next/prev greater/smaller |
| Monotonic Deque | O(n) | O(k) | Sliding window max/min |

---

## 🚀 Recommended Practice Order

1. **Start with Two Pointers**: Two Sum → 3Sum → Container With Most Water
2. **Move to Sliding Window**: Fixed size → Variable size → Advanced
3. **Master Monotonic Stack**: Next Greater → Daily Temperatures → Histogram problems
4. **Combine Techniques**: Trapping Rain Water, Sliding Window Maximum

---

*Generated for interview preparation. Focus on understanding patterns, not memorizing solutions!*
