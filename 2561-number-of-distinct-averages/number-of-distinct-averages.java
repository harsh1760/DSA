class Solution {
    public int distinctAverages(int[] nums) {

        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        HashSet<Double> s = new HashSet<>();

        while (i < j) {

            double result = (nums[i] + nums[j]) / 2.0;
            s.add(result);
            i++;
            j--;
        }
        return s.size();
    }
}