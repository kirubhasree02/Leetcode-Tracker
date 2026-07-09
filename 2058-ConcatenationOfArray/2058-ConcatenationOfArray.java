// Last updated: 09/07/2026, 15:07:01
class Solution {
    public int[] getConcatenation(int[] nums) {
        int a=nums.length;
        int[] ans=new int[2*a];
        for(int i=0;i<a;i++){
            ans[i]=nums[i];
            ans[i+a]=nums[i];
        }
        return ans;
    }
}