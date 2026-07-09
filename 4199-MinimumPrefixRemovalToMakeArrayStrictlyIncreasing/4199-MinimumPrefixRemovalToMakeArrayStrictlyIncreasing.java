// Last updated: 09/07/2026, 15:05:26
class Solution {
    public int minimumPrefixLength(int[] nums) {
        int n=nums.length;
        int b=0;
        for(int i=n-2;i>=0;i--){
            if(nums[i]>=nums[i+1]){
                b=i+1;
                break;
            }
        }
        return b;
    }
}