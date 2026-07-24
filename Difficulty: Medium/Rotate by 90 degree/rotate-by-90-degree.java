class Solution {
    public void rotateMatrix(int[][] mat) {
        // code here
        
        int cols = mat[0].length;
        int rows = mat.length;
        
        int k=cols-1;
       
        for(int i=0;i<rows;i++){
            for(int j=0;j<(cols)/2;j++){
                int t=mat[i][j];
                mat[i][j]=mat[i][k];
                mat[i][k]=t;
                k--;
            }
           
           k=cols-1;
        }
         for(int i=0;i<rows;i++){
            for(int j=i;j<cols;j++){
                int t=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=t;
            }
        }
    }
}