class Solution {
    public static int Harsh(int nums[]) {

        HashSet<Integer> mp = new HashSet<>();
        for (int key : nums) {
            if (key > 0) {
                mp.add(key);
            }
        }

        int smallnumber = 1;
        while (true) {

            if (!mp.contains(smallnumber)) {
                return smallnumber;
            }
            smallnumber++;
        }

    }

    public int firstMissingPositive(int[] nums) {
        return Harsh(nums);

       
    }
}