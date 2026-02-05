class Solution {
    public List<Integer> majorityElement(int[] nums) {
     
     int appear=nums.length/3;
     HashMap<Integer,Integer>mp=new HashMap<>();
     for(int i=0;i<nums.length;i++){
        mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
     }
        ArrayList<Integer>ln=new ArrayList<>();
     for(int m:mp.keySet()){
        if(mp.get(m)>appear){
            ln.add(m);
        }
     }
     
     return ln;   
    }
}