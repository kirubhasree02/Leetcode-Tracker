// Last updated: 10/10/2026, 21:54:05
1class Solution {
2    public List<Integer> mostVisited(int n, int[] rounds) {
3        List<Integer> res = new ArrayList<>();
4        int start = rounds[0];
5        int end = rounds[rounds.length - 1];
6        if (start <= end) {
7            for (int i = start; i <= end; i++) {
8                res.add(i);
9            }
10        } 
11        else {
12            for (int i = 1; i <= end; i++) {
13                res.add(i);
14            }
15            for (int i = start; i <= n; i++) {
16                res.add(i);
17            }
18        }
19
20        return res;
21    }
22}