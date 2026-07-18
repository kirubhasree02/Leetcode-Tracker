// Last updated: 18/07/2026, 20:10:15
1class Solution {
2    public String rearrangeString(String s, char x, char y) {
3        StringBuilder xcount=new StringBuilder();
4        StringBuilder ycount=new StringBuilder();
5        StringBuilder others=new StringBuilder();
6        for(int i=0;i<s.length();i++){
7            char ch=s.charAt(i);
8            if(ch==x){
9                xcount.append(ch);
10            }else if(ch==y){
11                ycount.append(ch);
12            }else{
13                others.append(ch);
14            }
15        }
16        return ycount.append(others).append(xcount).toString();
17    }
18}