// Last updated: 09/07/2026, 15:05:40
class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb = new StringBuilder();
    
        sb.append(s.substring(0, k));
        sb.reverse();
        sb.append(s.substring(k));
        return sb.toString();
    }
}

    