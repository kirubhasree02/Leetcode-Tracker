// Last updated: 18/10/2026, 08:55:57
1class Solution {
2    public int minDeletions(int[] nums) {
3        int n=nums.length;
4        if(n<=1) return 0;
5        int[] dp=new int[n];
6        int max=1;
7        for(int i=0;i<n;i++){
8            dp[i]=1;
9            for(int j=0;j<i;j++){
10                if(nums[i]!=nums[j]){
11                    dp[i]=Math.max(dp[i],dp[j]+1);
12                }
13            }
14            max=Math.max(max,dp[i]);
15        }
16        return n-max;
17    }
18}