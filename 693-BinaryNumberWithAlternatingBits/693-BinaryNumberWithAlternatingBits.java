// Last updated: 09/07/2026, 15:08:54
class Solution {
    public boolean hasAlternatingBits(int n) {
        int b=n^(n>>1);
        return (b&(b+1))==0?true:false;
    }
}