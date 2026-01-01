class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        Arrays.sort(nums);
         List<Integer>l=new ArrayList<Integer>();
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                l.add(nums[i]);
            }
        }
        return l;
    }
}