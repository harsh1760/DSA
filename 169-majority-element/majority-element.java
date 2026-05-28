class Solution {
    public int majorityElement(int[] nums) {
        
        Arrays.sort(nums);
        int n=nums.length;
        int last=n/2;
        return nums[last];

    }
}