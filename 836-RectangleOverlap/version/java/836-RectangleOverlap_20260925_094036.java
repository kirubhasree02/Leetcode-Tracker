// Last updated: 25/09/2026, 09:40:36
1class Solution {
2    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
3        // All 't's removed so they match the parameters (rec1, rec2) exactly
4        return rec2[0] < rec1[2] && rec2[2] > rec1[0] && 
5               rec2[1] < rec1[3] && rec2[3] > rec1[1];
6    }
7}
8