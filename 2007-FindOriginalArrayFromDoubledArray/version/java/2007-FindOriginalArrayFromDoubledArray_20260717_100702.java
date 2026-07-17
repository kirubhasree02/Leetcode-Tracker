// Last updated: 17/07/2026, 10:07:02
1class Solution {
2        public int[] findOriginalArray(int[] A) {
3        int n = A.length, i = 0;
4        if (n % 2 == 1) return new int[0];
5        int[] res = new int[n / 2];
6        Map<Integer, Integer> count = new TreeMap<>();
7        for (int a : A)
8            count.put(a, count.getOrDefault(a, 0) + 1);
9        for (int x : count.keySet()) {
10            if (count.get(x) > count.getOrDefault(x + x, 0))
11                return new int[0];
12            for (int j = 0; j < count.get(x); ++j) {
13                res[i++] = x;
14                count.put(x + x, count.get(x + x) - 1);
15            }
16        }
17        return res;
18    }
19}