// Last updated: 15/09/2026, 14:43:22
1class Solution {
2    public boolean repeatedSubstringPattern(String s) {
3        String doubled =s+s;
4        String sub=doubled.substring(1,doubled.length()-1);
5        return sub.contains(s);
6    }
7}