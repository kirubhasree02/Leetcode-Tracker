// Last updated: 09/07/2026, 15:08:37
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int left=1;
       int right=0;
       for(int pile:piles){
        right=Math.max(right,pile);
       }
        int ans=right;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(isValid(piles,mid,h)){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
    private boolean isValid(int[]piles,int speed,int h){
        long total=0;
        for(int pile:piles){
            total+=(pile/speed)+(pile %speed ==0? 0:1);
        }
        return total<=h;
    }
}