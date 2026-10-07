// Last updated: 07/10/2026, 19:46:15
1class Solution {
2    public int triangularSum(int[] nums) {
3        int n=nums.length;
4        for(int i=n;i>1;i--){
5            for(int j=0;j<i-1;j++){
6                nums[j]=(nums[j]+nums[j+1])%10;
7            }
8        }
9        return nums[0];
10    }
11}