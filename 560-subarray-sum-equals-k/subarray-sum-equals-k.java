class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
      
        for (int i = 0; i < nums.length; i++) {
                int cs=nums[i];
                 if(cs == k){
                count++;
            }
            for(int j=i+1;j<nums.length;j++){
                cs+=nums[j];
                if(cs==k){
                    count++;
                }
            }
        }

        return count;
    }
}