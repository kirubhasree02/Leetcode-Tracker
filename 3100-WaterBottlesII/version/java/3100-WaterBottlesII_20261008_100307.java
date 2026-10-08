// Last updated: 08/10/2026, 10:03:07
1class Solution {
2    public int maxBottlesDrunk(int numBottles, int numExchange) {
3        int total=numBottles;
4        int empty=numBottles;
5        while(empty>=numExchange){
6            empty-=numExchange;
7            total+=1;
8            empty+=1;
9            numExchange+=1;
10        }
11        return total;
12    }
13}