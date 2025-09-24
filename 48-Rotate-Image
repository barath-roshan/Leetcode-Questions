Problem Statement

You are given an n x n 2D matrix (square matrix). Rotate the image by 90 degrees clockwise, in place (you cannot use another matrix).

Example

Input:

matrix =
[ [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9] ]


Output:

[ [7, 4, 1],
  [8, 5, 2],
  [9, 6, 3] ]

Approach
🔹 Idea (2-step trick):

Transpose the matrix (swap matrix[i][j] with matrix[j][i]).

Rows become columns.

After transpose of example:

[ [1, 4, 7],
  [2, 5, 8],
  [3, 6, 9] ]


Reverse each row (swap left ↔ right).

After row reversal:

[ [7, 4, 1],
  [8, 5, 2],
  [9, 6, 3] ]


The transpose of a matrix means:

Swap rows with columns → element at (i, j) becomes (j, i).

Formally:

matrix[i][j] ↔ matrix[j][i]


(but only for i < j, so we don’t swap twice and don’t touch the diagonal).

Example

Initial matrix:

[ [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9] ]


We’ll do transpose.

Step-by-step swaps

We only swap elements above the diagonal (i < j).

i = 0

j = 1 → swap (0,1) with (1,0) → swap 2 and 4
→ matrix =

[ [1, 4, 3],
  [2, 5, 6],
  [7, 8, 9] ]


j = 2 → swap (0,2) with (2,0) → swap 3 and 7
→ matrix =

[ [1, 4, 7],
  [2, 5, 6],
  [3, 8, 9] ]


i = 1

j = 2 → swap (1,2) with (2,1) → swap 6 and 8
→ matrix =

[ [1, 4, 7],
  [2, 5, 8],
  [3, 6, 9] ]


i = 2

No j > i, so stop.

✅ After Transpose
[ [1, 4, 7],
  [2, 5, 8],
  [3, 6, 9] ]

🔍 Why we do this?

Transpose flips the matrix over its diagonal.

At this stage, the first column [1,2,3] became the first row [1,2,3] (just rotated halfway).

Then we need the reverse step to finish the 90° clockwise rotation.

✅ which is the required rotated matrix.

Reverse Each Row (Left ↔ Right)

The rule is:

Swap the first element with the last,

The second element with the second last,

Keep going until the row is reversed.

We do this for every row.

🔹 Row 1: [1, 4, 7]

Swap 1 (left) ↔ 7 (right) → [7, 4, 1]

🔹 Row 2: [2, 5, 8]

Swap 2 ↔ 8 → [8, 5, 2]

🔹 Row 3: [3, 6, 9]

Swap 3 ↔ 9 → [9, 6, 3]

✅ Final Matrix
[ [7, 4, 1],
  [8, 5, 2],
  [9, 6, 3] ]

🔍 What’s happening in code?
for (int i = 0; i < n; i++) {
    int left = 0, right = n - 1;  // two pointers
    while (left < right) {
        int temp = matrix[i][left];
        matrix[i][left] = matrix[i][right];
        matrix[i][right] = temp;
        left++;
        right--;
    }
}


left starts at column 0

right starts at last column n-1

They swap, then move inward

Loop ends when left >= right

This is exactly like reversing a string or array.
