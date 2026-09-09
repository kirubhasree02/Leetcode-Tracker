// Last updated: 09/09/2026, 09:53:52
1class Solution {
2    public int countSegments(String s) {
3       s=s.trim();
4       if(s.length()==0){
5        return 0;
6       }
7       return s.split("\\s+").length;
8    }
9}