// Last updated: 09/07/2026, 15:12:46
class Solution {
    public List<List<Integer>> generate(int numRows) {
        int[][] mat=new int[numRows][numRows];
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==i||j==0){
                    mat[i][j]=1;
                }else{
                    mat[i][j]=mat[i-1][j-1]+mat[i-1][j];
                }
                row.add(mat[i][j]);
            }
            res.add(row);
        }
        return res;
    }
}