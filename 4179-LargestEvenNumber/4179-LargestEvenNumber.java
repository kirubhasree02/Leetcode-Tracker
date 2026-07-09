// Last updated: 09/07/2026, 15:05:38
class Solution {
    public String largestEven(String s) {
        int lastindex=-1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='2'){
                lastindex=i;
                break;
            }
        }
        if(lastindex==-1){
            return "";
        }
        return s.substring(0,lastindex+1);
    }
}