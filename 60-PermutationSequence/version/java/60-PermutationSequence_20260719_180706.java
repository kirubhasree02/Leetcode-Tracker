// Last updated: 19/07/2026, 18:07:06
1class Solution {
2    public String getPermutation(int n, int k) {
3        List<Integer> num = new LinkedList<Integer>();
4        for (int i = 1; i <= n; i++) num.add(i);
5        int[] fact = new int[n];  // factorial
6        fact[0] = 1;
7        for (int i = 1; i < n; i++) fact[i] = i*fact[i-1];
8        k = k-1;
9        StringBuilder sb = new StringBuilder();
10        for (int i = n; i > 0; i--){
11            int ind = k/fact[i-1];
12            k = k%fact[i-1];
13            sb.append(num.get(ind));
14            num.remove(ind);
15        }
16        return sb.toString();
17    }
18}