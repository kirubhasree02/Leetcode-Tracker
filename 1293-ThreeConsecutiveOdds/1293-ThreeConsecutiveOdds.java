// Last updated: 09/07/2026, 15:08:08
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count=0;
        for(int x:arr){
            if((x&1)==1){
                count++;
                if(count==3) return true;
            }else{
                count =0;
            }
        }
        return false;
    }
}