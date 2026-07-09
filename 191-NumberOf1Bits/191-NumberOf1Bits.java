// Last updated: 09/07/2026, 15:11:37
class Solution {
    public int hammingWeight(int n) {
        int count=0;
       for(int i=0;i<31;i++){
        if((n&1)==1)
        count++;
        n=n>>1;
       }
       return count;
    }
}