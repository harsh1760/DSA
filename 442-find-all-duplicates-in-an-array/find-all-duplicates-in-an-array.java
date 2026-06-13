class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        ArrayList<Integer>ln=new ArrayList<>();
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(int n:mp.keySet()){

            int count=mp.get(n);
            if(count==2){
                ln.add(n);
            }
        }
        return ln;
    }
}