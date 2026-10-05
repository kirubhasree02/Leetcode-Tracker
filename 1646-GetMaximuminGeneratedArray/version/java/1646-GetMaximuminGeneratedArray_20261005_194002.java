// Last updated: 05/10/2026, 19:40:02
1class Solution {
2    public int getMaximumGenerated(int n) {
3        if(n==0) return 0;
4        if(n==1) return 1;
5        int[] nums=new int[n+1];
6        nums[0]=0;
7        nums[1]=1;
8        int ans=1;
9        for(int i=1;(2*i+1)<=n;i++){
10            nums[2*i]=nums[i];
11            nums[2*i+1]=nums[i]+nums[i+1];
12            ans=Math.max(ans,nums[2*i+1]);
13        }
14        return ans;
15    }
16}