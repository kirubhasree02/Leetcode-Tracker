// Last updated: 27/09/2026, 19:28:34
1class Solution {
2    public int[][] flipAndInvertImage(int[][] image) {
3        for(int i=0;i<image.length;i++){
4        int left=0;
5        int right=image[i].length-1;
6        while(left<=right){
7            if(left==right){
8                image[i][left]=1-image[i][left];
9            }else{ 
10                int temp=image[i][left];
11                image[i][left]=1-image[i][right];
12                image[i][right]=1-temp;
13            }
14                left++;
15                right--;
16        }
17        }
18        return image;
19    }
20}