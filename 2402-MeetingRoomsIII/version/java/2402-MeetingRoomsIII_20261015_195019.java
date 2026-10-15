// Last updated: 15/10/2026, 19:50:19
1class Solution {
2    public int mostBooked(int n, int[][] meetings) {
3        int[] count=new int[n];
4        long[] busy=new long[n];
5        Arrays.sort(meetings,(a,b)->a[0]-b[0]);
6        for(int[] meeting:meetings){
7            int start=meeting[0],end=meeting[1];
8            long earliest =Long.MAX_VALUE;
9            int roomIndex=-1;
10            boolean assigned=false;
11            for(int i=0;i<n;i++){
12                if(busy[i]<earliest){
13                    earliest=busy[i];
14                    roomIndex=i;
15                }
16                if(busy[i]<=start){
17                    busy[i]=end;
18                    count[i]++;
19                    assigned=true;
20                    break;
21                }
22            }
23            if(!assigned){
24                busy[roomIndex]+=(end-start);
25                count[roomIndex]++;
26            }
27        }
28        int max=0,res=0;
29        for(int i=0;i<n;i++){
30            if(count[i]>max){
31                max=count[i];
32                res=i;
33            }
34        }
35        return res;
36    }
37}