// Last updated: 27/09/2026, 21:22:59
1class Solution {
2    public int[] sortArrayByParityII(int[] nums) {
3        int j=1;
4        for(int i=0;i<nums.length;i+=2){
5            if(nums[i]%2==0) continue;
6            while(nums[j]%2!=0){
7                j+=2;
8            }
9            int temp=nums[i];
10            nums[i]=nums[j];
11            nums[j]=temp;
12        }
13        return nums;
14    }
15}