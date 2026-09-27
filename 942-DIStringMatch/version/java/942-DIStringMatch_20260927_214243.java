// Last updated: 27/09/2026, 21:42:43
1class Solution {
2    public int[] diStringMatch(String s) {
3        int n=s.length(),left=0,right=n;
4        int[] res=new int[n+1];
5        for(int i=0;i<n;i++){
6            if(s.charAt(i)=='I'){
7                res[i]=left;
8                left++;
9            }else{
10                res[i]=right;
11                right--;
12            }
13            res[n]=left;
14        }
15        return res;
16    }
17}