// Last updated: 20/09/2026, 18:02:41
1class Solution {
2    public int[] fairCandySwap(int[] a, int[] b) {
3        int sum1=0,sum2=0;
4        for(int i=0;i<a.length;i++){
5             sum1+=a[i];
6        }
7        for(int i=0;i<b.length;i++){
8            sum2+=b[i];
9        }
10        int diff=(sum1-sum2)/2;
11        for(int i=0;i<a.length;i++){
12            for(int j=0;j<b.length;j++){
13                if(a[i]-b[j]==diff){
14                    return new int[]{a[i],b[j]};
15                }
16            }
17        }
18        return null;
19    }
20}