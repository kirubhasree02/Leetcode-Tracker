// Last updated: 09/07/2026, 15:05:18
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            long sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(isValid(sum,x)){
                    count++;
                }
            }
        }
        return count;
    }
    private boolean isValid(long sum,int x){
        String s=String.valueOf(Math.abs(sum));
        int digit1=s.charAt(0)-'0';
        int last=(int) (Math.abs(sum)%10);
        return digit1== x && last==x;
    }
}