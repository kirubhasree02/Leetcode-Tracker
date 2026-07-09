// Last updated: 09/07/2026, 15:05:45
class Solution {
    public int findClosest(int x, int y, int z) {
        int d1=x-z;
        int d2=y-z;
        int a=Math.abs(d1);
        int b=Math.abs(d2);
        if(a>b){
            return 2;
        }else if(b>a){
            return 1;
        }else{
            return 0;
        }
    }
}