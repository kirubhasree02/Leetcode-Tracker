// Last updated: 27/09/2026, 21:29:19
1class Solution {
2    public boolean validMountainArray(int[] arr) {
3        int left=0;
4        int right=arr.length-1;
5        while(left<right){
6            if(arr[left+1]>arr[left]){
7                left++;
8            }else if(arr[right-1]>arr[right]){
9                right--;
10            }else{
11                break;
12            }
13        }
14        return left!=0 && right!=arr.length-1 && left==right;
15    }
16}