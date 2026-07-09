// Last updated: 09/07/2026, 15:07:39
class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        while(num!=0){
           if(num%2==0){
           num=num/2;
           count++;
           }else{
            num=num-1;
            count++;
           }
        }
        return count;
    }
}