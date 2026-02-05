class Solution {
    public static int Harsh(int nums[]){
        Arrays.sort(nums);
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            }
        }

            if(mp.size() == 0){
                return -1;
            }

            int maxCount = 0;
        int maxNumber = Integer.MAX_VALUE;

        for (int m : mp.keySet()) {
            int freq = mp.get(m);

            if (freq > maxCount || (freq == maxCount && m < maxNumber)) {
                maxCount = freq;
                maxNumber = m;
            }
        }
        return maxNumber;
    }
    public int mostFrequentEven(int[] nums) {
       return Harsh(nums);
    }
}