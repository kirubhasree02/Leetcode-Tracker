// Last updated: 09/07/2026, 15:06:13
class Solution {
    public int passThePillow(int n, int time) {
       int c=time/(n-1);
       int rem=time%(n-1);
       if(c%2==0){
        return rem+1;
       }else{
        return n-rem;
       }
    }
}