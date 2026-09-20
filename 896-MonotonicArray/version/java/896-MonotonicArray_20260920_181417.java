// Last updated: 20/09/2026, 18:14:17
1class Solution {
2    public boolean isMonotonic(int[] nums) {
3        boolean isIncreasing=true;
4        boolean isDecreasing=true;
5        for(int i=1;i<nums.length;i++){
6            if(nums[i]<nums[i-1]){
7                isIncreasing=false;
8            }
9            if(nums[i]>nums[i-1]){
10                isDecreasing=false;
11            }
12        }
13        return isIncreasing||isDecreasing;
14    }
15}