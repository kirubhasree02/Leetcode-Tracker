// Last updated: 09/07/2026, 15:08:39
class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int[][] res=new int[cols][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                res[j][i]=matrix[i][j];
            }
        }
        return res;
    }
}