class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        

        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){

        //         if(matrix[i][j]==target){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        int row=matrix.length-1;
        int col=0;

        while(col<matrix[0].length && row>=0){

            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]<target){
                col++;
            }else{
                row--;
            }
        }
        return false;
    }
}