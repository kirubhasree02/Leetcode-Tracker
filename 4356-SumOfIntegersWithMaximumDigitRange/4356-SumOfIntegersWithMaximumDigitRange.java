// Last updated: 09/07/2026, 15:05:05
class Solution {
    public int maxDigitRange(int[] nums) {
        int max=-1;
        int total =0;
        for(int num:nums){
            int currentDigit=getDigitRange(num);
            if(currentDigit>max){
                max=currentDigit;
                total=num;
            }else if(currentDigit==max){
                total+=num;
            }
        }
        return total;
    }
    private int getDigitRange(int num){
        int maxD=0;
        int minD=9;
        int temp=Math.abs(num);
        if(temp==0) return 0;
        while(temp>0){
            int d=temp%10;
            if(d>maxD) maxD=d;
            if(d<minD) minD=d;
            temp/=10;
        }
        return maxD-minD;
    }
}