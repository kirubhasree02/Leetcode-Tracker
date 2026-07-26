// Last updated: 26/07/2026, 08:10:04
1class Solution {
2    public int largestInteger(int n, int s) {
3        if(s>9*n){
4            return -1;
5        }
6        if(s==0){
7            return 0;
8        }
9        int res=0;
10        for(int i=0;i<n;i++){
11            int d=Math.min(9,s);
12            res=(res*10)+d;
13            s-=d;
14        }
15        return res;
16    }
17}