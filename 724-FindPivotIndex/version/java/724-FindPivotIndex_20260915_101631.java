// Last updated: 15/09/2026, 10:16:31
1class Solution {
2    public int pivotIndex(int[] nums) {
3        int total=0;
4        for(int num:nums){
5            total+=num;
6        }
7        int leftTotal=0;
8        for(int i=0;i<nums.length;i++){
9            int rightTotal=total-leftTotal-nums[i];
10            if(rightTotal==leftTotal){
11                return i;
12            }
13            leftTotal+=nums[i];
14        }
15        return -1;
16    }
17}