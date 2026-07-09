// Last updated: 09/07/2026, 15:05:20
class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int max=Integer.MAX_VALUE;
        int minIndex=-1;
        for(int i=0;i<capacity.length;i++){
            if(capacity[i]>=itemSize){
                if(capacity[i]<max){
                    max=capacity[i];
                    minIndex=i;
                    
                }
            }
        }
        return minIndex;
    }
}