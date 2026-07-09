// Last updated: 09/07/2026, 15:05:36
class Solution {
    public int residuePrefixes(String s) {
        int count=0;
        Set<Character>dc=new HashSet<>();
        for(int i=0;i<s.length();i++){
            dc.add(s.charAt(i));
            int len=i+1;
            if(dc.size()==len%3){
                count++;
            }
        }
        return count;
    }
}