// Last updated: 07/10/2026, 19:40:08
1class Solution {
2    public int timeRequiredToBuy(int[] tickets, int k) {
3        int total=0;
4        for(int i=0;i<tickets.length;i++){
5            if(i<=k){
6                total+=Math.min(tickets[i],tickets[k]);
7            }else{
8                total+=Math.min(tickets[i],tickets[k]-1);
9            }
10        }
11        return total;
12    }
13
14}