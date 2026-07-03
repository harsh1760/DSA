class Solution {
    public List<Integer> getRow(int rowIndex) {
         List<List<Integer>> ln1 = new ArrayList<>();

        for (int i = 0; i <=rowIndex; i++) {
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
        return ln1.get(rowIndex);
    }
}