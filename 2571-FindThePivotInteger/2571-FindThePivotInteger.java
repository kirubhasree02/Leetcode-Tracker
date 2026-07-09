// Last updated: 09/07/2026, 15:06:31
class Solution {
    public int pivotInteger(int n) {
        for(int x=1;x<=n;x++){
            int s1=0,s2=0;
            for(int i=1;i<=x;i++){
                s1+=i;
            }
            for(int j=x;j<=n;j++){
                s2+=j;
            }
             if(s1==s2) return x;
        }
         return -1;
    }
}