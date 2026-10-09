// Last updated: 09/10/2026, 09:48:12
1class Solution {
2    public int findTargetSumWays(int[] nums, int target) {
3        int total=0;
4        for(int num:nums){
5            total+=num;
6        }
7        if(Math.abs(target)>total||(target+total)%2!=0){
8            return 0;
9        }
10        int subset=(total+target)/2;
11        int[] dp=new int[subset+1];
12         dp[0]=1;
13         for(int num:nums){
14            for(int i=subset;i>=num;i--){
15                dp[i]+=dp[i-num];
16            }
17         }
18         return dp[subset];
19    }
20}