// Last updated: 15/09/2026, 15:19:15
1class Solution {
2    public boolean judgeCircle(String moves) {
3        int x=0,y=0;
4        for(int i=0;i<moves.length();i++){
5            char c=moves.charAt(i);
6           if(c=='U') y++;
7           if(c=='D') y--;
8           if(c=='R') x++;
9           if(c=='L') x--;
10        }
11        return x==0 && y==0;
12    }
13}