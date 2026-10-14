// Last updated: 14/10/2026, 22:07:25
1class Solution {
2    public int[] numberGame(int[] v) {
3        int n=v.length;
4        Arrays.sort(v);
5        for(int i=0;i<n;i+=2){
6            if(i+1<n){
7                int temp=v[i];
8                v[i]=v[i+1];
9                v[i+1]=temp;
10            }
11        }
12        return v;
13    }
14}