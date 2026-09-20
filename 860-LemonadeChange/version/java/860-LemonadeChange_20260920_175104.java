// Last updated: 20/09/2026, 17:51:04
1class Solution {
2    public boolean lemonadeChange(int[] bills) {
3        int five=0,ten=0;
4        for(int i:bills){
5            if(i==5) five++;
6            else if(i==10){
7                five--;
8                ten++;
9            }else if(ten>0){
10                ten--;
11                five--;
12            }else{
13                five-=3;
14            }
15            if(five<0) return false;
16        }
17        return true;
18    }
19}