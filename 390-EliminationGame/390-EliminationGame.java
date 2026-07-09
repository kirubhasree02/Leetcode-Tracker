// Last updated: 09/07/2026, 15:10:10
class Solution {
    public int lastRemaining(int n) {
        boolean left=true;
        int rem=n;
        int step=1;
        int head=1;
        while(rem>1){
            if(left|| rem%2==1){
                head=head+step;
            }
            rem=rem/2;
            step=step*2;
            left=!left;
        }
        return head;
    }
}