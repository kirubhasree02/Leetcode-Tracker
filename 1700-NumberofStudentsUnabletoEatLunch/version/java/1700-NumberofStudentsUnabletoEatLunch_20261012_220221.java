// Last updated: 12/10/2026, 22:02:21
1class Solution {
2    public int countStudents(int[] a, int[] b) {
3        int count[]={0,0} ,n=a.length,k;
4        for(int A:a){
5            count[A]++;
6        }
7        for(k=0;k<n && count[b[k]]>0;k++){
8            count[b[k]]--;
9        }
10        return n-k;
11    }
12}