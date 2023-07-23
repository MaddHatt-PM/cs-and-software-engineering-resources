# Search a 2D Matrix - Leetcode 74 - Python
## Reading the problem

Given a matrix of m x n with the properties that:
- Integers of each vector row are sorted from left to right
- The first element of search vector row is greater than the last element of the previous vector row.

Example matrix:
01 | 03 | 05 | 07
10 | 11 | 16 | 20
23 | 30 | 34 | 60

Given the following properties, we can binary search with the range of each vector row and then binary search through the row.
For the range binary search, we will need to compare the endpoints of each vector row to determine which way to go.
Therefore, our algorithm will have a O(log m * log n).