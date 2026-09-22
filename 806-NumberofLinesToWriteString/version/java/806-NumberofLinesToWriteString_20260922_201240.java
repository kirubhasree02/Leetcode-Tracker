// Last updated: 22/09/2026, 20:12:40
1class Solution {
2    public int[] numberOfLines(int[] widths, String s) {
3        int res=1,cur=0;
4        for(char c:s.toCharArray()){
5            int width=widths[c-'a'];
6            res=cur+width>100?res+1:res;
7            cur=cur+width>100?width:cur+width;
8        }
9        return new int[]{res,cur};
10    }
11}