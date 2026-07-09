// Last updated: 09/07/2026, 15:10:23
class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
            int carry=(a&b)<<1;
            a=a^b;
            b=carry;
        }
        return a;
    }
}