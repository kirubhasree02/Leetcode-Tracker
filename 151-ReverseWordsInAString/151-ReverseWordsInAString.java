// Last updated: 09/07/2026, 15:12:19
class Solution {
    public String reverseWords(String s) {
        String[] words=s.trim().split("\\s+");
        String rev="";
        for(int i=words.length-1;i>=0;i--){
            rev=rev+words[i]+" ";
        }
        return rev.trim();
    }
}