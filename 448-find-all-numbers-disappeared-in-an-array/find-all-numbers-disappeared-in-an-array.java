class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> l = new ArrayList<>();
      HashMap<Integer, Integer> l1 = new HashMap<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            l1.put(nums[i], l1.getOrDefault(nums[i], 0) + 1);
        }

        for(int i=1;i<=nums.length;i++){
            if(!l1.containsKey(i)){
                l.add(i);
            }
        }
        
        return l;
    }
}