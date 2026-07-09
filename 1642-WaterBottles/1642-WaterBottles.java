// Last updated: 09/07/2026, 15:07:25
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drink=numBottles;
        int empty=numBottles;
        while(empty>=numExchange){
            int d=empty/numExchange;
            empty=(empty%numExchange)+d;
            drink+=d;
        }
        return drink;
    }
}