// Last updated: 06/09/2026, 08:54:46
1class Solution {
2    public int countRotations(String s, int k) {
3        int n=s.length(),ans=0;
4        for(int i=0;i<n;i++){
5            int score=0;
6            for(int j=0;j<n-1;j++){
7                if(s.charAt((i+j)%n)==s.charAt((i+j+1)%n)) {
8                    score++;
9                }
10            }
11            if(score==k) ans++;
12        }
13        return ans;
14    }
15}