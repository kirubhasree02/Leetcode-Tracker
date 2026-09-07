// Last updated: 07/09/2026, 21:25:32
1class Solution {
2    public String countAndSay(int n) {
3        if(n==0) return null;
4        if(n==1) return "1";
5        else{
6            String s=countAndSay(n-1);
7            StringBuilder sb=new StringBuilder();
8            char[] c=s.toCharArray();
9            int count=1;
10            for(int i=1;i<c.length;i++){
11                if(c[i]==c[i-1]){
12                    count++;
13                }else{
14                    sb.append(count).append(c[i-1]);
15                    count=1;
16                }
17            }
18            sb.append(count).append(c[c.length-1]);
19            return sb.toString();
20        }
21    }
22}