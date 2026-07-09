// Last updated: 09/07/2026, 15:09:45
class Solution {
    public int arrangeCoins(int n) {
        int i=1;
        while(n>0){
            i++;
            n=n-i;
        }
        return i-1;
    }
}