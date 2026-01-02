class Solution {
    public int[] getSneakyNumbers(int[] nums) {

        ArrayList<Integer> kl = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                kl.add(nums[i]);
            }
        }
        int[] num = new int[kl.size()];
        int p = 0;
        for (int k : kl) {
            num[p++] = k;
        }
        return num;
    }
}