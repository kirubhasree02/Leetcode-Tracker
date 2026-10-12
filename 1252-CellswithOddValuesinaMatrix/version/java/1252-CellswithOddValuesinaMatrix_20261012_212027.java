// Last updated: 12/10/2026, 21:20:27
1class Solution {
2    public int oddCells(int m, int n, int[][] indices) {
3        int[] row=new int[m];
4        int[] col=new int[n];
5        for(int[] idx:indices){
6            row[idx[0]]++;
7            col[idx[1]]++;
8        }
9        int oddcount=0;
10        for(int r=0;r<m;r++){
11            for(int c=0;c<n;c++){
12                if((row[r]+col[c])%2!=0){
13                    oddcount++;
14                }
15            }
16        }
17        return oddcount;
18    }
19}