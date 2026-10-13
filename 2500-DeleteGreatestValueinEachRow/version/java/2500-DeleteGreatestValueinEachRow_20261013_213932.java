// Last updated: 13/10/2026, 21:39:32
1class Solution {
2    public int deleteGreatestValue(int[][] grid) {
3        for(int i=0; i<grid.length; i++)    Arrays.sort(grid[i]);
4        int res = 0;
5        for(int i=0; i<grid[0].length; i++){
6            int max = 0;
7            for(int j=0; j<grid.length; j++)    
8                max = Math.max(max, grid[j][i]);
9            res += max;
10        }
11        return res;
12    }
13}