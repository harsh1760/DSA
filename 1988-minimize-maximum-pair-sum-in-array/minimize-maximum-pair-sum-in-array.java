class Solution {
    public int minPairSum(int[] nums) {
        
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int tota=0;
        while(i<=j){

           tota=Math.max(nums[i]+nums[j],tota);
           i++;
           j--;
        }
        return tota;
    }
}