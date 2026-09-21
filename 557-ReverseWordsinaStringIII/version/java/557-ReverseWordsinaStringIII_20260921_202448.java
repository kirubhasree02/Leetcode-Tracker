// Last updated: 21/09/2026, 20:24:48
1class Solution {
2    public String reverseWords(String s) {
3            String[] words=s.split(" ");
4            StringBuilder result=new StringBuilder();
5            for(int i=0;i<words.length;i++){
6                StringBuilder rev=new StringBuilder(words[i]).reverse();
7                result.append(rev);
8                if(i<words.length-1){
9                    result.append(" ");
10                }
11            }
12            return result.toString();
13
14    }
15}