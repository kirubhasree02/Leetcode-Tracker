// Last updated: 15/09/2026, 15:57:10
1class Solution {
2    public boolean checkValidString(String s) {
3        int cmin = 0, cmax = 0; // open parentheses count in range [cmin, cmax]
4        for (char c : s.toCharArray()) {
5            if (c == '(') {
6                cmax++;
7                cmin++;
8            } else if (c == ')') {
9                cmax--;
10                cmin--;
11            } else if (c == '*') {
12                cmax++; // if `*` become `(` then openCount++
13                cmin--; // if `*` become `)` then openCount--
14                // if `*` become `` then nothing happens
15                // So openCount will be in new range [cmin-1, cmax+1]
16            }
17            if (cmax < 0) return false; 
18            cmin = Math.max(cmin, 0);   
19        }
20        return cmin == 0;
21    }
22}