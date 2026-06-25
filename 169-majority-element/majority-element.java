class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer>ln=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            ln.put(nums[i],ln.getOrDefault(nums[i],0)+1);
        }

        for(int n:ln.keySet()){

            int c= ln.get(n);
            if(nums.length/2<c){
                return n;
            }
        }
        return -1;
    }
}