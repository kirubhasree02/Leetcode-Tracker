// Last updated: 09/07/2026, 15:14:54
class Solution {
    public boolean isPalindrome(int x) {
        int original=x,rev=0;
        if(x<0) return false;
        while(x!=0){
            int last=x%10;
            rev=rev*10+last;
            x/=10;
        }
        if(original==rev) return true;
        else return false;
    }
}