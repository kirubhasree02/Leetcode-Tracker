// Last updated: 09/07/2026, 15:10:50
class Solution {
    public int nthUglyNumber(int n) {
        int[] ugly=new int[n];
        ugly[0]=1;
        int index2=0,index3=0,index5=0;
        int fact2=2,fact3=3,fact5=5;
        for(int i=1;i<n;i++){
            int min=Math.min(Math.min(fact2,fact3),fact5);
            ugly[i]=min;
            if(fact2==min){
                fact2=2*ugly[++index2];
            }
            if(fact3==min){
                fact3=3*ugly[++index3];
            }
            if(fact5==min){
                fact5=5*ugly[++index5];
            }
        }
        return ugly[n-1];
    }
}