class Solution {
    public int majorityElement(int[] nums) {
        
        
        HashMap<Integer,Integer>ln=new HashMap<>();
        int i=0;
        int j=nums.length;

       while(i<j){
            ln.put(nums[i],ln.getOrDefault(nums[i],0)+1);
            // ln.put(nums[j],ln.getOrDefault(nums[j],0)+1);
            i++;
          
        }

        for(int num:ln.keySet()){

            int count= ln.get(num);
            if(nums.length/2<count){
                return num;
            }
        }
        return -1;
    }
}