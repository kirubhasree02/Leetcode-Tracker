// Last updated: 09/08/2026, 09:26:40
1class Solution {
2    public double minPrice(int[] prices, int[] discounts) {
3    Arrays.sort(prices);
4    Arrays.sort(discounts);
5    double total=0;
6        for(int i=prices.length-1,j=discounts.length-1;i>=0;i--){
7            double d=(j>=0)?discounts[j--]:0;
8            total+=prices[i]*(100.0-d)/100.0;
9        }
10        return total;
11    }
12}