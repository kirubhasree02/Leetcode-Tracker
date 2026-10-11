// Last updated: 11/10/2026, 17:17:58
1class Solution {
2    public int[] arrayChange(int[] A, int[][] op) {
3    HashMap<Integer,Integer> store= new HashMap<>();
4    for(int i=0;i<A.length;i++) store.put(A[i],i);
5    for(var i:op){
6        A[store.get(i[0])]= i[1];             
7        store.put(i[1],store.get(i[0]));       
8    }
9    return A;
10}
11}