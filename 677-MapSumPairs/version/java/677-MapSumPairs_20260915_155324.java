// Last updated: 15/09/2026, 15:53:24
1class MapSum {
2    Map<String,Integer> map;
3
4    public MapSum() {
5        map=new HashMap<>();
6    }
7    
8    public void insert(String key, int val) {
9        map.put(key,val);
10        
11    }
12    
13    public int sum(String prefix) {
14        int result=0;
15        for(String key:map.keySet()){
16            if(key.startsWith(prefix)){
17                result+=map.get(key);
18            }
19        }
20        return result;
21    }
22}
23
24/**
25 * Your MapSum object will be instantiated and called as such:
26 * MapSum obj = new MapSum();
27 * obj.insert(key,val);
28 * int param_2 = obj.sum(prefix);
29 */