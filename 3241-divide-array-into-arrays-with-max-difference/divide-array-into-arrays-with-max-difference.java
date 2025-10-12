class Solution {
    public static int[][] Harsh(int nums[], int k) {

        Arrays.sort(nums);
        int total = nums.length;
        if (total % 3 != 0) {
            return new int[0][0];
        }
        int row = total / 3;
         int index=0;
        int num[][] = new int[row][3];
        for (int i = 0; i < row; i++) {

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < 3; j++) {
                num[i][j] = nums[index++];
                max = Math.max(num[i][j], max);
                min = Math.min(num[i][j], min);
            }

            if (max - min > k) {
                 return new int[0][0];
            }

        }

        return num;
    }

    public int[][] divideArray(int[] nums, int k) {
        return Harsh(nums, k);
    }
}