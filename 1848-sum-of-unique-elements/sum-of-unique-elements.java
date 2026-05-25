class Solution {
    public int sumOfUnique(int[] nums) {
        
        HashMap<Integer,Integer>mp=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        int sum=0;
        for(int n:mp.keySet()){
            int n1=mp.get(n);
            if(n1==1){
            sum+=n;
            }
        }
        return sum;
    }
}