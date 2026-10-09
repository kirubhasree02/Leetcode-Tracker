// Last updated: 09/10/2026, 09:29:01
1class Solution {
2    public int maxCount(int m, int n, int[][] ops) {
3        if(ops==null||ops.length==0){
4            return m*n;
5        }
6        int row=Integer.MAX_VALUE,col=Integer.MAX_VALUE;
7        for(int[] op:ops){
8            row=Math.min(row,op[0]);
9            col=Math.min(col,op[1]);
10        }
11        return row*col;
12    }
13}