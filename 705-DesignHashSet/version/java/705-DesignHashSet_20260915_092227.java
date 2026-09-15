// Last updated: 15/09/2026, 09:22:27
1class MyHashSet {
2      private boolean[] mp;
3    public MyHashSet() {
4        mp=new boolean[1000001];
5        Arrays.fill(mp,false);
6    }
7    
8    public void add(int key) {
9        mp[key]=true;
10        
11    }
12    
13    public void remove(int key) {
14        mp[key]=false;
15    }
16    
17    public boolean contains(int key) {
18        return mp[key];
19    }
20}
21
22/**
23 * Your MyHashSet object will be instantiated and called as such:
24 * MyHashSet obj = new MyHashSet();
25 * obj.add(key);
26 * obj.remove(key);
27 * boolean param_3 = obj.contains(key);
28 */