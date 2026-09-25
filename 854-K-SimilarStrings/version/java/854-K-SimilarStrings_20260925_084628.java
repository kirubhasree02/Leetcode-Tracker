// Last updated: 25/09/2026, 08:46:28
1class Solution {
2    public int kSimilarity(String A, String B) {
3        if (A.equals(B)) return 0;
4        Set<String> vis= new HashSet<>();
5        Queue<String> q= new LinkedList<>();
6        q.add(A);
7        vis.add(A);
8        int res=0;
9        while(!q.isEmpty()){
10            res++;
11            for (int sz=q.size(); sz>0; sz--){
12                String s= q.poll();
13                int i=0;
14                while (s.charAt(i)==B.charAt(i)) i++;
15                for (int j=i+1; j<s.length(); j++){
16                    if (s.charAt(j)==B.charAt(j) || s.charAt(j)!=B.charAt(i) ) continue;
17                    String temp= swap(s, i, j);
18                    if (temp.equals(B)) return res;
19                    if (vis.add(temp)) q.add(temp);
20                }
21            }
22        }
23        return res;
24    }
25    public String swap(String s, int i, int j){
26        char[] ca=s.toCharArray();
27        char temp=ca[i];
28        ca[i]=ca[j];
29        ca[j]=temp;
30        return new String(ca);
31    }
32}