// Last updated: 27/09/2026, 11:41:31
1class Solution {
2    public int threeSumClosest(int[] nums, int target) {
3        Arrays.sort(nums);
4        int n=nums.length;
5        int res=nums[0]+nums[1]+nums[2];
6        for(int i=0;i<n-2;i++){
7            int left=i+1,right=n-1;
8            while(left<right){
9                int sum=nums[i]+nums[left]+nums[right];
10                if(Math.abs(target-sum)<Math.abs(target-res)){
11                    res=sum;
12                }
13                if(sum==target) return target;
14                else if(sum<target) left++;
15                else right--;
16            }
17        }
18        return res;
19    }
20}