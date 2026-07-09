// Last updated: 09/07/2026, 15:10:53
class Solution {
    public int addDigits(int num) {
        while(num>=10){ 
           int sum=0,last=0;
            while(num!=0){
              last=num%10;
              sum=sum+last;
              num/=10;
            }
            num=sum;
        }
        return num;
    }
}