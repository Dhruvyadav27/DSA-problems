class Solution {
    public void rotate(int[][] matrix) {
        int cols = matrix[0].length;
        int rows = matrix.length;
        for(int i=0;i<rows;i++){
            for(int j=i;j<cols;j++){
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
        int k=cols-1;
       
        for(int i=0;i<rows;i++){
            for(int j=0;j<(cols)/2;j++){
                int t=matrix[i][j];
                matrix[i][j]=matrix[i][k];
                matrix[i][k]=t;
                k--;
            }
           
           k=cols-1;
        }
    }
}