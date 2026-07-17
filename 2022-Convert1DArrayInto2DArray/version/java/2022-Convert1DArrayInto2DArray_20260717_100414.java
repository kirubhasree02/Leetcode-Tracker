// Last updated: 17/07/2026, 10:04:14
1class Solution {
2    public int[][] construct2DArray(int[] original, int m, int n) {
3	if(original.length != m*n) return new int[0][0];
4	int[][] result = new int[m][n];
5	for(int i=0;i<original.length;i++)
6		result[i/n][i%n] = original[i];
7	return result;
8  }
9}