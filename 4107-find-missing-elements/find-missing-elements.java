class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int mn = Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;
        for (int n : nums) {
            mn = Math.min(mn, n);
            mx = Math.max(mx, n);
        }

        ArrayList<Integer> ln = new ArrayList<>();
        for (int j = mn; j <= mx; j++) {

            boolean found = false;
            for (int l : nums) {
                if (l == j) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                ln.add(j);
            }

        }
        return ln;
    }
}