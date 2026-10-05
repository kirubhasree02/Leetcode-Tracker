// Last updated: 05/10/2026, 19:33:04
1class Solution {
2    private String getString(String str){
3        int n=str.length(),count=0;
4        String result="0";
5        for(int i=n-1;i>=0;i--){
6            char ch=str.charAt(i);
7            if(ch=='#') count++;
8            else{
9                if(count>0) count--;
10                else{
11                    result+=ch;
12                }
13            }
14        }
15        return result;
16    }
17    public boolean backspaceCompare(String S, String T) {
18        return getString(S).equals(getString(T));
19    }
20}