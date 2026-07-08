class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int n=nums.length;
        int array[]=new int[n];

        int j=0;
        int k=1;

        for(int i=0;i<n;i++){

            if(nums[i]<0){
                array[k]=nums[i];
                k+=2;
            }else{
                array[j]=nums[i];
                j+=2;
            }
        }
        return array;
    }
}