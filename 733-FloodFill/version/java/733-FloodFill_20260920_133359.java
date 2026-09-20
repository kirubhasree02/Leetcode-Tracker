// Last updated: 20/09/2026, 13:33:59
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
3        if(image[sr][sc]==newColor) return image;
4        fill(image,sr,sc,image[sr][sc],newColor);
5        return image;
6    }
7    private void fill(int[][] image,int sr,int sc,int color,int newColor){
8        if(sr<0||sr>=image.length||sc<0||sc>=image[0].length||image[sr][sc]!=color) return;
9        image[sr][sc]=newColor;
10        fill(image,sr+1,sc,color,newColor);
11        fill(image,sr-1,sc,color,newColor);
12        fill(image,sr,sc+1,color,newColor);
13        fill(image,sr,sc-1,color,newColor);
14    }
15}