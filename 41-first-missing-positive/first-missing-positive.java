class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int n=nums.length;
        Arrays.sort(nums);
        
          int k = 1;

        for (int num : nums) {
            if (num == k) {
                k++;
            }
        }

        return k;
    }
}