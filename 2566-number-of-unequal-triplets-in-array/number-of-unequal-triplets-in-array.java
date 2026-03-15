class Solution {
    public int unequalTriplets(int[] nums) {
        
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                for(int k=j;k<nums.length;k++){

                    if(i>=0 && j>i && k>j && k<nums.length && nums[i] != nums[j] 
                        && nums[i] != nums[k] && nums[j] != nums[k]){
                            count++;
                    }
                }
            }
        }
        return count;
    }
}