class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

       Set<List<Integer>> s = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {

                if (nums[i] + nums[j] + nums[k] == 0) {
                    ArrayList<Integer> ln = new ArrayList<>();
                    ln.add(nums[i]);
                    ln.add(nums[j]);
                    ln.add(nums[k]);
                    k--;
                    j++;
                    s.add(ln);
                } else if (nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                }

            }
        }
        return new ArrayList<>(s);
    }

}