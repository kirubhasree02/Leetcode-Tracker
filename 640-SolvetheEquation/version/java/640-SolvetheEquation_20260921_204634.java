// Last updated: 21/09/2026, 20:46:34
1class Solution {
2    public String solveEquation(String equation) {
3        String[] sides=equation.split("=");
4        int[] lhs=evaluate(sides[0]);
5        int[] rhs=evaluate(sides[1]);
6        int a=lhs[0]-rhs[0];
7        int b=rhs[1]-lhs[1];
8        if(a==0 && b==0){
9            return "Infinite solutions";
10        }
11        if(a==0){
12            return "No solution";
13        }
14        return "x="+(b/a);
15    }
16    private int[] evaluate(String  side){
17        String[] terms=side.replace("-","+-").split("\\+");
18        int xCoeff = 0;
19        int constant = 0;
20        
21        for (String term : terms) {
22            if (term.isEmpty()) continue;
23            if (term.endsWith("x")) {
24                if (term.equals("x") || term.equals("+x")) {
25                    xCoeff += 1;
26                } else if (term.equals("-x")) {
27                    xCoeff -= 1;
28                } else {
29                    xCoeff += Integer.parseInt(term.replace("x", ""));
30                }
31            } else {
32                constant += Integer.parseInt(term);
33            }
34        }
35        
36        return new int[]{xCoeff, constant};
37    }
38}