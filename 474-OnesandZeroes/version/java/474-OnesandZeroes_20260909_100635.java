// Last updated: 09/09/2026, 10:06:35
1class Solution {
2    public int findMaxForm(String[] strs, int m, int n) {
3        int[][] dp=new int[m+1][n+1];
4        for(String s:strs){
5            int[] count=countZeroOnes(s);
6            int zeros=count[0],ones=count[1];
7            for(int i=m;i>=zeros;i--){
8                for(int j=n;j>=ones;j--){
9                    dp[i][j]=Math.max(dp[i][j],dp[i-zeros][j-ones]+1);
10                }
11            }
12        }
13        return dp[m][n];
14    }
15    private int[] countZeroOnes(String s){
16        int zeros=0,ones=0;
17        for(char c:s.toCharArray()){
18            if(c=='0') zeros++;
19            else ones++;
20        }
21        return new int[]{zeros,ones};
22    }
23}