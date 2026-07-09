// Last updated: 09/07/2026, 15:14:01
class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int cs=0;
        for(int i=0;i<nums.length;i++){
            cs+=nums[i];
            if(cs>max)
             max=cs;
             if(cs<0)
             cs=0;
        }
        return max;
    }
}