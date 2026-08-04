class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int mn = Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;
        HashSet<Integer> s = new HashSet<>();
        for (int n : nums) {
            s.add(n);
            mn = Math.min(mn, n);
            mx = Math.max(mx, n);
        }

        ArrayList<Integer> ln = new ArrayList<>();
        for (int j = mn; j <= mx; j++) {

            if (!s.contains(j)) {
                ln.add(j);
            }
        }
        return ln;
    }
}