class Solution {
    public void setZeroes(int[][] matrix) {
        
        int m=matrix.length;
        int n=matrix[0].length;

        ArrayList<Integer>ln=new ArrayList<>();
        ArrayList<Integer>ln1=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                if(matrix[i][j]==0){
                    ln.add(i);
                    ln1.add(j);
                }
            }
        }

        for(int rows:ln){
            for(int i=0;i<n;i++){
                matrix[rows][i]=0;
            }
        }
        for(int cols:ln1){
            for(int j=0;j<m;j++){
                matrix[j][cols]=0;
            }
        }
    }
}