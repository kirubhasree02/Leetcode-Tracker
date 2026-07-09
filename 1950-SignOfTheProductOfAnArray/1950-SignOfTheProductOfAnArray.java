// Last updated: 09/07/2026, 15:07:04
class Solution {
    public int arraySign(int[] nums) {
        int n=1;
        for(int i:nums){
            if(n<0)  n=-1;
            if(n>0) n=1;
            n=n*i;
        }
        if(n==0) {
            return 0;
        }else if(n<0){
            return -1;
        }else{
            return 1;
        } 
    }
}