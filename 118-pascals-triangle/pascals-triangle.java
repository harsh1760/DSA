class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ln1 = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> ln = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    ln.add(1);
                } else {
                    ln.add(ln1.get(i - 1).get(j - 1) + ln1.get(i - 1).get(j));
                }
            }
            ln1.add(ln);
        }
        return ln1;
    }
}