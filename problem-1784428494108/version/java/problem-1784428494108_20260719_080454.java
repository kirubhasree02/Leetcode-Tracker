// Last updated: 19/07/2026, 08:04:54
1class Solution {
2    public boolean canReach(int[] start, int[] target) {
3        int startcolor=(start[0]+start[1])%2;
4        int targetcolor=(target[0]+target[1])%2;
5        return startcolor==targetcolor;
6    }
7}