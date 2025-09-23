Problem Recap of 75- SORT COLORS

We have an array with only three possible values:

0 → red

1 → white

2 → blue

We need to sort them so that all 0s come first, then 1s, then 2s.

🧠 Core Idea (Counting Sort for 3 Values)

Instead of doing a full sorting algorithm (like quicksort or mergesort), we can take advantage of the fact that there are only 3 unique numbers.

So the logic is:

Count how many 0s, 1s, and 2s are in the array.

Example: [2,0,2,1,1,0] has 2 zeros, 2 ones, 2 twos.

Reconstruct the array by writing that many 0s, then that many 1s, then that many 2s.

So we overwrite the array into [0,0,1,1,2,2].

🔑 Why It Works

Sorting is normally about comparing elements. But here, comparisons aren’t needed because:

The values are only 0, 1, 2.

We know the order in advance (0 < 1 < 2).

So the fastest way is just: count + rewrite.
