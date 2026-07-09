// Last updated: 09/07/2026, 15:05:07
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        int n=nums.length;
        long totalSum=0;
        for(int i=0;i<k;i++){
            int currentVal=nums[n-1-i];
            if(mul>1){
                totalSum+=(long)currentVal*mul;
            }else{
                totalSum+=currentVal;
            }
            mul--;
        }
        return totalSum;
    }
}