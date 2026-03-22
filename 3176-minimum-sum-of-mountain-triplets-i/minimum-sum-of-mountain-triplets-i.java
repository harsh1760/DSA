class Solution {
    public int minimumSum(int[] nums) {

        int min_value = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {

                    if (nums[i] < nums[j] && nums[k] < nums[j]) {

                        int sum = nums[i] + nums[j] + nums[k];
                        min_value = Math.min(sum, min_value);
                    }
                }
            }
        }

        return min_value == Integer.MAX_VALUE ? -1 : min_value;
    }
}