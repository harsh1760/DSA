class Solution {
    public int sumOfSquares(int[] nums) {
        
        long total=0;
        int n=nums.length ;
        for(int i=1;i<=n;i++){

            if(n% i==0){
            long result = (long) nums[i-1] * nums[i-1];

                total+=result;
            }
        }
        return (int)total;
    }
}