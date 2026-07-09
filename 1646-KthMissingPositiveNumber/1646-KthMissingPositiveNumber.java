// Last updated: 09/07/2026, 15:07:24
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int x=1;
        for(int i:arr){
            if(i<=k) k++;
            else break;
        }
        return k;
    }
}