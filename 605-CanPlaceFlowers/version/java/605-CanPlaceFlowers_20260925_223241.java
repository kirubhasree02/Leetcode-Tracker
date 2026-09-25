// Last updated: 25/09/2026, 22:32:41
1class Solution {
2    public boolean canPlaceFlowers(int[] f, int n) {
3        if(n==0) return true;
4        for(int i=0;i<f.length;i++){
5            if(f[i]==0 && (i==0 || f[i-1]==0)&&(i==f.length-1||f[i+1]==0)){
6                n--;
7                if(n==0) return true;
8                f[i]=1;
9            }
10        }
11        return false;
12    }
13}