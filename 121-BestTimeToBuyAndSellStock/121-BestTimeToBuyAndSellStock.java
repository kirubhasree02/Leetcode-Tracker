// Last updated: 09/07/2026, 15:12:41
class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0;
        int minBuyPrice=prices[0];
       for(int i=0;i<prices.length;i++){
           int sellprice=prices[i];
           if(sellprice > minBuyPrice){
            int profit=sellprice - minBuyPrice;
            if(profit > maxp) maxp = profit;
           }else{
             minBuyPrice = sellprice;
           }
       }
       return maxp;
    }
}