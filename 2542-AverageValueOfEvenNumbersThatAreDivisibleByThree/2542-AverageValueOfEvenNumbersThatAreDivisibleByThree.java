// Last updated: 09/07/2026, 15:06:37
class Solution {
    public int averageValue(int[] nums) {
       int sum =0,count=0;
       for(int n:nums){
          if(n%2==0 && n%3==0){
            sum+=n;
            count++;
           }
       }
       if(sum==0) return 0;
       return sum/count;
    }
}