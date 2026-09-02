// Last updated: 02/09/2026, 09:36:06
1class Solution {
2    public String shortestPalindrome(String s) {
3        int j=0;
4        for(int i=s.length()-1;i>=0;i--){
5            if(s.charAt(i)==s.charAt(j)){
6                j+=1;
7            }
8        }
9        if(j==s.length()){
10            return s;
11        }
12        String suffix=s.substring(j);
13        return new StringBuffer(suffix).reverse().toString()+shortestPalindrome(s.substring(0,j))+suffix;
14    }
15}