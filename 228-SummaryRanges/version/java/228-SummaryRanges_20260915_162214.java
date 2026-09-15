// Last updated: 15/09/2026, 16:22:14
1class Solution {
2    public List<String> summaryRanges(int[] nums) {
3        List<String> result=new ArrayList<>();
4        if(nums.length==0) return result;
5        int i=0;
6        while(i<nums.length){
7            int start=nums[i];
8            while(i+1<nums.length && nums[i+1]==nums[i]+1){
9                i++;
10            }
11            if(nums[i]==start){
12                result.add(String.valueOf(start));
13            }else{
14                result.add(start+"->"+nums[i]);
15            }
16            i++;
17        }
18        return result;
19    }
20}