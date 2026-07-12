// Last updated: 12/07/2026, 22:34:08
1public class Solution {
2    public int largestPalindrome(int n) {
3        if (n==1) return 9;
4        int max=(int)Math.pow(10, n)-1;
5        for (int v=max-1;v>max/10;v--) {
6            long u=Long.valueOf(v+new StringBuilder().append(v).reverse().toString());
7            for (long x=max;x*x>=u;x--)
8                if (u%x==0)
9                    return (int)(u%1337);
10        }
11        return 0;
12    }
13}