// Last updated: 09/07/2026, 15:10:24
class Solution {
    public boolean isPerfectSquare(int num) {
        int odd=1;
        while(num>0){
            num-=odd;
            odd+=2;
        }
        return num==0;
    }
}