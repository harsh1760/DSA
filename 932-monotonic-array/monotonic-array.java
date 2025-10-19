class Solution {
    public boolean isMonotonic(int[] nums) {
        
        boolean found=true;
        boolean found1=true;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                found=false;
            }
            if(nums[i]<nums[i+1]){
                found1=false;
            }
        }

       

        return found || found1;
    }
}