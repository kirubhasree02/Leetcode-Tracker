// Last updated: 09/07/2026, 15:06:21
class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long volume=(long) length*width*height;
        boolean isBulky=(length>=10000||width>=10000||height>=10000||volume>=1000000000);
        boolean isHeavy=(mass>=100);
        if(isBulky && isHeavy) return "Both";
        if(isBulky) return "Bulky";
        if(isHeavy) return "Heavy";
        return "Neither";
    }
}