// Last updated: 09/07/2026, 15:07:31
class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++) nums[i]+=nums[i-1];
         return nums;
    }
}