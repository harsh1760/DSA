class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {

        Arrays.sort(capacity);
        int num = 0;
        for (int n : apple) {
            num += n;
        }

        int sum = 0;
        int count = 0;

        for (int i = capacity.length - 1; i >= 0; i--) {
            sum += capacity[i];
            count++;
            if (sum >= num) {
                return count;
            }
        }

        return capacity.length;
    }
}