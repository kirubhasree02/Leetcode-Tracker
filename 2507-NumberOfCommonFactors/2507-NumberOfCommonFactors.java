// Last updated: 09/07/2026, 15:06:39
class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        for(int i=1;i<=a;i++){
           if(a%i==0 && b%i==0){
            count++;
           }
        }
        return count;
    }
}