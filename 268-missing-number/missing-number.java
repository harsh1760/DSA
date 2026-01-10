class Solution {
    public static int Harsh(int nums[]) {
		
		int n=nums.length;
        int nm=(n*(n+1))/2;
        int sum=0;
        for(int l:nums){
            sum+=l;
        }
        
        return nm-sum;
	}
    public int missingNumber(int[] nums) {
        return Harsh(nums);
    }
}