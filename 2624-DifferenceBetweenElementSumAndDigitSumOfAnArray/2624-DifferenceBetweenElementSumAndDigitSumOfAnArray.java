// Last updated: 09/07/2026, 15:06:18
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1=0;
        for(int n:nums){
            sum1+=n;
        }
        int sum2=0;
        for(int m:nums){
          while(m>0){
            int last=m%10;
            sum2=sum2+last;
            m/=10;
          }
        }
        return sum1-sum2;
        
    }
}