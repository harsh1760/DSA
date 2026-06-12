class Solution {
    public int findPeakElement(int[] nums) {

        int m = Integer.MIN_VALUE;
        for (int n : nums) {
            m = Math.max(m, n);
        }

        for (int j = 0; j < nums.length; j++) {

            if (nums[j] == m) {
                return j ;
            }
        }

        return -1;
    }
}