// Last updated: 14/10/2026, 22:00:01
1class Solution {
2    public int[] separateDigits(int[] nums) {
3        List<Integer> list =new ArrayList<>();
4        for(int num:nums){
5            String s=String.valueOf(num);
6            for(char ch:s.toCharArray()){
7                list.add(ch-'0');
8            }
9        }
10        int[] res=new int[list.size()];
11        for(int i=0;i<list.size();i++){
12            res[i]=list.get(i);
13        }
14        return res;
15    }
16}