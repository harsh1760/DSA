class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        ArrayList<Integer> ln = new ArrayList<>();
        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                ln.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                ln.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    ln.add(matrix[bottom][j]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int j = bottom; j >= top; j--) {
                    ln.add(matrix[j][left]);
                }
                left++;
            }
        }
        return ln;
    }
}