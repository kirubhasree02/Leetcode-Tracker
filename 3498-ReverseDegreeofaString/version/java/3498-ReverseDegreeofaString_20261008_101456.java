// Last updated: 08/10/2026, 10:14:56
1class Solution {
2    public int reverseDegree(String s) {
3        int ans=0;
4        for(int i=0;i<s.length();i++){
5            ans+=('z'-s.charAt(i)+1)*(i+1);
6        }
7        return ans;
8    }
9}