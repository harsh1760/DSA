class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        int total = 0;
       
        for (int n : mp.keySet()) {
         
            if (mp.get(n) == 2) {
                total ^= n;
            }
        }
      
        return total;

    }
}