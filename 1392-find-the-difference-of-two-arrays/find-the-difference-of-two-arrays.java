class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> ln2 = new ArrayList<>();

        HashSet<Integer> mp = new HashSet<>();
        HashSet<Integer> mp1 = new HashSet<>();

        for (int n : nums1) {
            mp.add(n);
        }
        for (int n : nums2) {
            mp1.add(n);
        }

        ArrayList<Integer> ln3 = new ArrayList<>();
        for (int n : mp) {
            if (!mp1.contains(n)) {
                ln3.add(n);
            }
        }

        ArrayList<Integer> ln = new ArrayList<>();
        for (int n : mp1) {
            if (!mp.contains(n)) {
                ln.add(n);
            }
        }

        ln2.add(ln3);
        ln2.add(ln);

        return ln2;

    }
}