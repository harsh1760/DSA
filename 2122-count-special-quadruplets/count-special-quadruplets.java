class Solution {
    public int countQuadruplets(int[] nums) {
       
       int count=0;

       for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                for(int k=j;k<nums.length;k++){
                    for(int p=k;p<nums.length;p++){

                        if(i<j && j<k && k<p && nums[i] + nums[j] + nums[k] == nums[p]){
                            count++;
                        }
                    }
                }
            }
       }
            return count;
    }
}