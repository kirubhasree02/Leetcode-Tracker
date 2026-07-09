// Last updated: 09/07/2026, 15:10:17
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for(int i=0;i<ransomNote.length();i++){
            String letter=String.valueOf(ransomNote.charAt(i));
            if(magazine.contains(letter)){
                magazine=magazine.replaceFirst(letter,"");
            }else{
                return false;
            }
        }
        return true;
    }
}