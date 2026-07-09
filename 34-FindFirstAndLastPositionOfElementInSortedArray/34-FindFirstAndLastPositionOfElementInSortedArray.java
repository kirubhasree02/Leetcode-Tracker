// Last updated: 09/07/2026, 15:14:29
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        ans[0]=binarySearch(nums,target,true);
        ans[1]=binarySearch(nums,target,false);
        return ans;
    }
    static int binarySearch(int[] nums,int target,boolean findFirst){
        int left=0;
        int right=nums.length-1;
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target>nums[mid]){
                left=mid+1;
            }else if(target<nums[mid]){
                right=mid-1;
            }else{
                ans=mid;
                if(findFirst){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
        }
        return ans;
    }
}