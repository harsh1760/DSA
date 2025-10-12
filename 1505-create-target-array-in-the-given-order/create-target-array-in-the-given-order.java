class Solution {
    public static int[] Harsh(int nums[],int index[]){

        ArrayList<Integer> list = new ArrayList<>();

       
        for(int i=0;i<nums.length;i++){
            list.add(index[i], nums[i]); 
        }
      int[] result = new int[list.size()];
        for(int k=0;k<list.size();k++){
           result[k]=list.get(k);
        }
        return result;
    }
    public int[] createTargetArray(int[] nums, int[] index) {
        return Harsh(nums,index);
    }
}