class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i] - arr[i - 1]);
        }

        for (int j = 1; j < arr.length; j++) {
            ArrayList<Integer> list1 = new ArrayList<>();

            if (arr[j] - arr[j - 1] == min) {
                list1.add(arr[j - 1]);
                list1.add(arr[j]);
                result.add(list1);
            }
        }
        return result;
    }
}