// Last updated: 08/09/2026, 10:23:19
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int l=0,r=nums.length-1;
4        while(nums[l]+nums[r]!=target){
5            if(nums[l]+nums[r]<target) l++;
6            else r--;
7        }
8        return new int[]{l+1,r+1};
9    }
10}