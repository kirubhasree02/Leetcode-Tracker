// Last updated: 15/09/2026, 15:14:05
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        StringBuilder sb=new StringBuilder();
4        for(int i=s.length()-1;i>=0;i--){
5            if(s.charAt(i)!='-'){
6                sb.append(sb.length()%(k+1)==k?'-':"").append(s.charAt(i));
7            }
8        }
9        return sb.reverse().toString().toUpperCase();
10    }
11}