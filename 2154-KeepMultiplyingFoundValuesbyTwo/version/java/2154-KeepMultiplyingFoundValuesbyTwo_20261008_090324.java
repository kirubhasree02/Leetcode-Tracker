// Last updated: 08/10/2026, 09:03:24
1class Solution {
2    public int findFinalValue(int[] nums, int original) {
3        Set<Integer> numSet=new HashSet<>();
4        for(int num:nums){
5            numSet.add(num);
6        }
7        while(numSet.contains(original)){
8            original*=2;
9        }
10        return original;
11    }
12}