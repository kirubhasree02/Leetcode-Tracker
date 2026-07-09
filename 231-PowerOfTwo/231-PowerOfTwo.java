// Last updated: 09/07/2026, 15:11:07
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        else return (n&(n-1))==0;
    }
}