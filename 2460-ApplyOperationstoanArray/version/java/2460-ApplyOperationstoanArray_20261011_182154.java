// Last updated: 11/10/2026, 18:21:54
1class Solution {
2    public int[] applyOperations(int[] nums) {
3        int n=nums.length;
4        for(int i=0;i<n-1;i++){
5            if(nums[i]==nums[i+1]){
6                nums[i]*=2;
7                nums[i+1]=0;
8            }
9        }
10        int[] res=new int[n];
11        int idx=0;
12        for(int i=0;i<n;i++){
13            if(nums[i]!=0){
14                res[idx]=nums[i];
15                idx++;
16            }
17
18        }
19        return res;
20    }
21}