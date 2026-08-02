// Last updated: 02/08/2026, 08:07:35
1class Solution {
2    public long maxPairStrength(int[] nums) {
3        long max=0;
4        for(int i=0;i<nums.length;i++){
5            for(int j=i+1;j<nums.length;j++){
6                long a=nums[i],b=nums[j],temp;
7                while(b!=0){
8                    temp=b;
9                    b=a%b;
10                    a=temp;
11                }
12                max=Math.max(max,((long)nums[i]*nums[j])/(a*a));
13            }
14        }
15        return max;
16    }
17}