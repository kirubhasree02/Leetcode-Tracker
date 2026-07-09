// Last updated: 09/07/2026, 15:14:32
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend ==Integer.MIN_VALUE && divisor ==-1) return Integer.MAX_VALUE;
        if(dividend == Integer.MIN_VALUE && divisor ==1) return Integer.MIN_VALUE;
        boolean negative=(dividend<0)^(divisor<0);
        long absDividend=Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);
        int q=0;
        while(absDividend>=absDivisor){
            long temp1=absDivisor,multiple=1;
            while(absDividend>=(temp1<<1)){
                temp1<<=1;
                multiple<<=1;
            }
            absDividend-=temp1;
            q+=multiple;
        }
        return negative?-q : q;
    }
}