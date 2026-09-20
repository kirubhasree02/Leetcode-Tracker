// Last updated: 20/09/2026, 13:49:24
1class Solution {
2    public int dominantIndex(int[] nums) {
3        int max=-1,index=-1,second=-1;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]>max){
6                second=max;
7                max=nums[i];
8                index=i;
9            }else if(nums[i]>second){
10                second=nums[i];
11            }
12        }
13        return second*2<=max?index:-1;
14
15    }
16}