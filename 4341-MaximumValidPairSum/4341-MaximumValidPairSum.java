// Last updated: 09/07/2026, 15:05:11
class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n=nums.length;
        int max=nums[0];
        int maxsum=nums[0]+nums[k];
        for(int j=k+1;j<n;j++){
            max=Math.max(max,nums[j-k]);
            maxsum=Math.max(maxsum,max+nums[j]);
        }
        return maxsum;
    }
}