// Last updated: 09/07/2026, 15:14:35
class Solution {
    public int removeElement(int[] nums, int val) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
              nums[index]=nums[i];
              index++;
            }
        }
        return index;
    }
}