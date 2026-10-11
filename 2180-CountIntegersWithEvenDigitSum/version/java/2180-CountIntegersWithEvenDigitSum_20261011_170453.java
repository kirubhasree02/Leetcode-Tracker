// Last updated: 11/10/2026, 17:04:53
1class Solution {
2    public int countEven(int num) {
3        int count=0;
4        for(int i=1;i<=num;i++){
5            if(getDigitSum(i)%2==0){
6                count++;
7            }
8        }
9        return count;
10    }
11    private int getDigitSum(int n){
12        int sum=0;
13        while(n>0){
14            sum+=n%10;
15            n/=10;
16        }
17        return sum;
18    }
19}