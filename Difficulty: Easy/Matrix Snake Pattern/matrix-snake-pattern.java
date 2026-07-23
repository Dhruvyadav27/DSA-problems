class Solution {
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int row = 0; row < matrix.length; row++) {
            
            if (row % 2 == 0) {
                for (int col = 0; col < matrix[0].length; col++) {
                    result.add(matrix[row][col]);
                }
            } 
            
            else {
                for (int col = matrix[0].length - 1; col >= 0; col--) {
                    result.add(matrix[row][col]);
                }
            }
        }
        
        return result;
    }
}