class Solution {
    public int[][] generateMatrix(int n) {

        int matrix[][] = new int[n][n];

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        int count = 1;
        while (top <= bottom && left <= right) {

            for (int j = left; j <= right; j++) {
                matrix[top][j] = count++;
            }
            top++;
            for (int j = top; j <= bottom; j++) {
                matrix[j][right] = count++;
            }
            right--;
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    matrix[bottom][j] = count++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int j = bottom; j >= top; j--) {
                    matrix[j][left] = count++;
                }
                left++;
            }
        }
        return matrix;
    }
}