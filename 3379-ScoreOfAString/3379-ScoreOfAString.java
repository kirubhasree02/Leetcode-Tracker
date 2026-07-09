// Last updated: 09/07/2026, 15:05:52
class Solution {
    public int scoreOfString(String s) {
        int total=0;
        for(int i=0;i<s.length()-1;i++){
            int n=s.charAt(i)-s.charAt(i+1);
            total+=Math.abs(n);
        }
        return total;
    }
}