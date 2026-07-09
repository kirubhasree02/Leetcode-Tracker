// Last updated: 09/07/2026, 15:12:38
class Solution {
    public boolean isPalindrome(String s) {
     String obj=s.toLowerCase().replaceAll("[^a-z0-9]","");
     StringBuilder sb=new StringBuilder(obj);
     return obj.equals(sb.reverse().toString());   
    }
}