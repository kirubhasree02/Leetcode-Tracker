// Last updated: 09/09/2026, 10:16:26
1class Solution {
2    public String reverseStr(String s, int k) {
3        char[] arr=s.toCharArray();
4        for(int i=0;i<arr.length;i+=2*k){
5            int start=i;
6            int end=Math.min(i+k-1,arr.length-1);
7            while(start<end){
8                char temp=arr[start];
9                arr[start]=arr[end];
10                arr[end]=temp;
11                start++;
12                end--;
13            }
14        }
15        return new String(arr);
16    }
17}