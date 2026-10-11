// Last updated: 11/10/2026, 08:52:22
1class Solution {
2    public boolean threeFibonacciSum(int n) {
3        long f1=0;
4        long f2=1;
5        long f3=1;
6        while(f1+f2+f3<=n){
7            if(f1+f2+f3==n){
8                return true;
9            }
10            long temp=f2+f3;
11            f1=f2;
12            f2=f3;
13            f3=temp;
14        }
15        return false;
16    }
17}