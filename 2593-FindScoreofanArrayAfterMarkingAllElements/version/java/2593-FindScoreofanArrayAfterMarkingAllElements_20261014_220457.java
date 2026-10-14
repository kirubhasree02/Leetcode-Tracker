// Last updated: 14/10/2026, 22:04:57
1class Solution {
2    public long findScore(int[] nums) {
3        long score=0;
4        Set<int[]> set=new TreeSet<>((a,b)->(a[0]==b[0])?a[1]-b[1]:a[0]-b[0]);
5        for(int i=0;i<nums.length;i++) set.add(new int[]{nums[i],i});
6        for(int[] s:set){
7            if(nums[s[1]]==0) continue;
8            score+=(long)s[0];
9            nums[s[1]]=0;
10            if(s[1]>0) nums[s[1]-1]=0;
11            if(s[1]+1<nums.length) nums[s[1]+1]=0;
12        }
13        return score;
14    }
15}