// Last updated: 09/07/2026, 15:06:26
class Solution {
    public int countDigits(int num) {
       int count=0,temp=num;
       while(temp!=0){
        int last=temp%10;
        if(num%last==0)
           count++; 
           temp/=10;          
       } 
       return count;
    }
}