// Last updated: 15/10/2026, 20:27:39
1class Solution {
2    public int matrixSum(int[][] nums) {
3            int ans=0;
4        for(int []row:nums)
5        {
6                Arrays.sort(row);
7        }
8            for(int i=0;i<nums[0].length;i++)
9            {
10                    int m=0;
11                    for(int j=0;j<nums.length;j++)
12                    {
13                            if(m<nums[j][i])
14                                    m=nums[j][i];
15                    }
16                    ans+=m;
17            }
18            return ans;
19    }
20}