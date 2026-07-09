// Last updated: 09/07/2026, 15:13:29
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int n:nums){
            if(i<2||n>nums[i-2])
            nums[i++]=n;
        }
        return i;
    }
}