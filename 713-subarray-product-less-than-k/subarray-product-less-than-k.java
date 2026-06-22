class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
       
        int c=0;
        for(int i=0;i<nums.length;i++){
           long sum=1;
            for(int j=i;j<nums.length;j++){
                sum*=nums[j];
                if(k>sum){
                    c++;
                }else{
                    break;
                }

            }
        }
        return c;
    }
}