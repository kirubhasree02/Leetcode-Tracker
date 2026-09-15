// Last updated: 15/09/2026, 21:50:01
1class Solution {
2    public int findLHS(int[] nums) {
3       Arrays.sort(nums);
4       int j=0;
5       int maxLength=0;
6       for(int i=0;i<nums.length;i++){
7        while(nums[i]-nums[j]>1){
8            j++;
9        }
10        if(nums[i]-nums[j]==1){
11            maxLength=Math.max(maxLength,i-j+1);
12        }
13       }
14       return maxLength;
15    }
16}