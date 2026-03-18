class Solution {
    public int maxProduct(int[] nums) {

        if(nums.length==1){
            return nums[nums.length-1];
        }
        int maxproduct = 0;
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = i; j < nums.length; j++) {
                product *= nums[j];
                maxproduct = Math.max(product, maxproduct);
            }
        }
        return maxproduct;
    }
}