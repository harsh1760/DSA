class Solution {
    public int singleNumber(int[] nums) {

        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
         mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);

        }

        for (int n : mp.keySet()) {
                int num=mp.get(n);
                if(num==1){
                    return n;
                }
            }
        return -1;
    }
}