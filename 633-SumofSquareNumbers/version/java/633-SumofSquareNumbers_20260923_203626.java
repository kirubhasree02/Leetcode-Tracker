// Last updated: 23/09/2026, 20:36:26
1class Solution {
2    public boolean judgeSquareSum(int c) {
3        for(int i=2;i*i<=c;i++){
4            if(c%i==0){
5                int exp=0;
6                while(c%i==0){
7                    exp++;
8                    c/=i;
9                }
10                if(i%4==3 && exp%2!=0){
11                    return false;
12                }
13            }
14        }
15        return c%4!=3;
16    }
17}