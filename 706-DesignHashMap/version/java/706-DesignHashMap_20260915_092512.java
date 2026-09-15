// Last updated: 15/09/2026, 09:25:12
1class MyHashMap {
2int[] data;
3    public MyHashMap() {
4        data= new int[1000001];
5        Arrays.fill(data,-1);
6    }
7    
8    public void put(int key, int value) {
9        data[key]=value;
10    }
11    
12    public int get(int key) {
13        return data[key];
14    }
15    
16    public void remove(int key) {
17        data[key]=-1;
18    }
19}
20
21/**
22 * Your MyHashMap object will be instantiated and called as such:
23 * MyHashMap obj = new MyHashMap();
24 * obj.put(key,value);
25 * int param_2 = obj.get(key);
26 * obj.remove(key);
27 */