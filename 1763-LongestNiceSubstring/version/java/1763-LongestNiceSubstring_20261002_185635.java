// Last updated: 02/10/2026, 18:56:35
1class Solution {
2    public String longestNiceSubstring(String s) {
3        if(s.length()<2) return"";
4        char[] arr=s.toCharArray();
5        Set<Character> set=new HashSet<>();
6        for(char c:arr) set.add(c);
7        for(int i=0;i<arr.length;i++){
8            char c=arr[i];
9            if(set.contains(Character.toUpperCase(c)) && set.contains(Character.toLowerCase(c))) continue;
10            String sub1=longestNiceSubstring(s.substring(0,i));
11            String sub2=longestNiceSubstring(s.substring(i+1));
12            return sub1.length()>=sub2.length()?sub1:sub2;
13        }
14        return s;
15    }
16}