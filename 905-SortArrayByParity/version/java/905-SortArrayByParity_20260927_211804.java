// Last updated: 27/09/2026, 21:18:04
1class Solution {
2    public int[] sortArrayByParity(int[] nums) {
3        int left=0;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]%2==0){
6                int temp=nums[left];
7                nums[left]=nums[i];
8                nums[i]=temp;
9                left++;
10            }
11        }
12        return nums;
13    }
14}