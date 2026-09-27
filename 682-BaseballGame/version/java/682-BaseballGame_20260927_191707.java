// Last updated: 27/09/2026, 19:17:07
1class Solution {
2    public int calPoints(String[] operations) {
3        int[] res=new int[operations.length];
4        int size=0;
5        for(String op:operations){
6            if(op.equals("C")){
7                size--;
8            }else if(op.equals("D")){
9                res[size]= 2* res[size-1];
10                size++;
11            }else if(op.equals("+")){
12                res[size]=res[size-1]+res[size-2];
13                size++;
14            }else{
15                res[size]=Integer.parseInt(op);
16                size++;
17            }
18        }
19        int total=0;
20        for(int i=0;i<size;i++){
21            total+=res[i];
22        }
23        return total;
24    }
25}