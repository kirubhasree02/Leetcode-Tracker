// Last updated: 01/08/2026, 20:28:33
1class Solution {
2    public int countValidPrefixes(String s) {
3        int validcount=0;
4        int c1=0;
5        int c2=0;
6        for(int i=0;i<s.length();i++){
7            if(s.charAt(i)=='0'){
8                c1++;
9            }else{
10                c2++;
11            }
12            if(Math.abs(c1-c2)<=1){
13               validcount++; 
14            }
15        }
16        return validcount;
17    }
18}