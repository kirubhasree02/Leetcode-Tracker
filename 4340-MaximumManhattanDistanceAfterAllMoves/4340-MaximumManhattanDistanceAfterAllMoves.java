// Last updated: 09/07/2026, 15:05:09
class Solution {
    public int maxDistance(String moves) {
        int x=0,y=0,cards=0;
        for(char c:moves.toCharArray()){
            if(c=='U') y++;
            else if(c=='D') y--;
            else if(c=='L') x--;
            else if(c=='R') x++;
            else if(c=='_') cards++;
        }
        return Math.abs(x)+Math.abs(y)+cards;
    }
}