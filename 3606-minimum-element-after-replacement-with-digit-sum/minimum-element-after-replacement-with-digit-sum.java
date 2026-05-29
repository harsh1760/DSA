class Solution {
    public int minElement(int[] nums) {
        
        int array[]=new int[nums.length];

        for(int i=0;i<nums.length;i++){

            int num=nums[i];
           
            int add=0;
            while(num>0){
                int last=num%10;
                add=add+last;
                num=num/10;
            }
            array[i]=add;
        }
        Arrays.sort(array);
        return array[0];
    }
}