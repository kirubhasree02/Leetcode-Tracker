// Last updated: 20/10/2026, 16:50:42
1public class Solution {
2    public int islandPerimeter(int[][] grid) {
3        int islands = 0, neighbours = 0;
4
5        for (int i = 0; i < grid.length; i++) {
6            for (int j = 0; j < grid[i].length; j++) {
7                if (grid[i][j] == 1) {
8                    islands++; // count islands
9                    if (i < grid.length - 1 && grid[i + 1][j] == 1) neighbours++; // count down neighbours
10                    if (j < grid[i].length - 1 && grid[i][j + 1] == 1) neighbours++; // count right neighbours
11                }
12            }
13        }
14
15        return islands * 4 - neighbours * 2;
16    }
17}