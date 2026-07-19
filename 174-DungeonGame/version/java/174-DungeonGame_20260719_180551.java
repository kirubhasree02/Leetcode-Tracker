// Last updated: 19/07/2026, 18:05:51
1class Solution {
2    public int calculateMinimumHP(int[][] dungeon) {
3    if (dungeon == null || dungeon.length == 0 || dungeon[0].length == 0) return 0;
4    
5    int m = dungeon.length;
6    int n = dungeon[0].length;
7    
8    int[][] health = new int[m][n];
9
10    health[m - 1][n - 1] = Math.max(1 - dungeon[m - 1][n - 1], 1);
11
12    for (int i = m - 2; i >= 0; i--) {            
13        health[i][n - 1] = Math.max(health[i + 1][n - 1] - dungeon[i][n - 1], 1);
14    }
15
16    for (int j = n - 2; j >= 0; j--) {
17        health[m - 1][j] = Math.max(health[m - 1][j + 1] - dungeon[m - 1][j], 1);
18    }
19
20    for (int i = m - 2; i >= 0; i--) {
21        for (int j = n - 2; j >= 0; j--) {
22            int down = Math.max(health[i + 1][j] - dungeon[i][j], 1);
23            int right = Math.max(health[i][j + 1] - dungeon[i][j], 1);
24            health[i][j] = Math.min(right, down);
25        }
26    }
27
28    return health[0][0];
29  }
30}