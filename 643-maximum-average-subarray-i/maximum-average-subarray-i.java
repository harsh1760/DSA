class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        if(nums.length==1){
            return nums[nums.length-1];
        }
        double maxAvg = Double.NEGATIVE_INFINITY;
        int start=0;
        int end=0;
       double sum=0;
        while(end<nums.length){
            sum+=nums[end];

            if(end-start+1<k){
                end++;
            }else{
               double a=sum/k;
                maxAvg=Math.max(maxAvg,a);
                sum-=nums[start];
                start++;
                end++;
            }
        }
        return maxAvg;
    }
}