// Last updated: 09/09/2026, 10:21:11
1class Solution {
2    public boolean checkRecord(String s) {
3        int a=0;
4        int l=0;
5        for(int i=0;i<s.length();i++){
6            char ch=s.charAt(i);
7            if(ch=='A'){
8                a++;
9                if(a>=2){
10                    return false;
11                }
12            }
13            if(ch=='L'){
14                l++;
15                if(l>=3){
16                    return false;
17                }
18            }else{
19                l=0;
20            }
21        }
22        return true;
23    }
24}