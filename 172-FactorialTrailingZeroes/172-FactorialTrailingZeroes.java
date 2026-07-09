// Last updated: 09/07/2026, 15:12:06
class Solution {
    public int trailingZeroes(int n) {
       int result=0;
       while(n>0){
        n=n/5;
        result+=n;
       }
       return result;
    }
}