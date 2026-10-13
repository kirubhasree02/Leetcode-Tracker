// Last updated: 13/10/2026, 21:34:42
1class Solution {
2    public int minMaxGame(int[] nums) {
3        int n=nums.length;
4        while(n>1){
5            n=n/2;
6            for(int i=0;i<n;i++){
7                if(i%2==0){
8                   nums[i]=Math.min(nums[2*i],nums[2*i+1]);
9                }else{
10                    nums[i]=Math.max(nums[2*i],nums[2*i+1]);
11                }
12            }
13        }
14        return nums[0];
15    }
16}