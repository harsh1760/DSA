class Solution {


public static int[] Harsh(int num[],int target) {
		
		int n=num.length;
		for(int i=0;i<n-1;i++) {
			
			for(int j=i+1;j<n;j++) {
				
		if(num[i]+num[j]==target) {
			return new int[] {i,j};
		}
		
			}
		}
		
		return new int[]{};
	}
	
    public int[] twoSum(int[] nums, int target) {
  return Harsh(nums,target);
    }}