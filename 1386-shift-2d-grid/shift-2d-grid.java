class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        ArrayList<Integer> list = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                list.add(grid[i][j]);
            }
        }

       
        Collections.rotate(list, k);

        List<List<Integer>> ls = new ArrayList<>();

        int index = 0;
        for (int i = 0; i < m; i++) {
            List<Integer> list1 = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list1.add(list.get(index++));
            }
            ls.add(list1);
        }

        return ls;
    }
}