// Last updated: 09/07/2026, 15:05:54
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0,temp=x;
        while(x!=0){
            int d=x%10;
            sum=sum+d;
            x/=10;
        }
        if(temp%sum==0) return sum;
        else return -1;
    }
}