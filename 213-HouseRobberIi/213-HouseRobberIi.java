// Last updated: 09/07/2026, 15:11:18
class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        return Math.max(getMax(nums,0,nums.length-2),getMax(nums,1,nums.length-1));
    }
    private int getMax(int[] nums,int start,int end){
        int prev=0,max=0;
        for(int i=start;i<=end;i++){
            int temp=Math.max(max,prev+nums[i]);
            prev=max;
            max=temp;
        }
        return max;
    }
}