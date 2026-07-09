// Last updated: 09/07/2026, 15:05:49
class Solution {
    public String winningPlayer(int x, int y) {
        int a=Math.min(x,y/4);
        if(a%2==0) return "Bob";
        else return "Alice";
    }
}