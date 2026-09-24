// Last updated: 24/09/2026, 09:06:16
1class Solution {
2    public int largestPerimeter(int[] nums) {
3        Arrays.sort(nums);
4        for(int i=nums.length-1;i>1;i--){
5            if(nums[i]<nums[i-1]+nums[i-2]){
6                return nums[i]+nums[i-1]+nums[i-2];
7            }
8        }
9        return 0;
10    }
11}