class Solution {
    public int[] singleNumber(int[] nums) {
        
        if(nums.length==2){
            return nums;
        }
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        int Array[]=new int[2];
        int p=0;
        for(int l:mp.keySet()){
            if(mp.get(l)==1){
                Array[p++]=l;
            }
        }
        return Array;
    }
}