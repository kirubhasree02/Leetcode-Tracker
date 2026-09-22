// Last updated: 22/09/2026, 08:55:31
1class Solution {
2    public boolean rotateString(String s, String goal) {
3        if(s.length()!=goal.length()){
4            return false;
5        }
6        String doubled=s+s;
7        return doubled.contains(goal);
8
9    }
10}