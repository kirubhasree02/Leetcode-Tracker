// Last updated: 09/07/2026, 15:05:42
class Solution {
    public int mirrorDistance(int n) {
        int original=n,rev=0;
        while(n!=0){
            int last=n%10;
            rev=rev*10+last;
            n/=10;
        }
        return Math.abs(original-rev);
        
    }
}