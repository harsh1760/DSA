class Solution {
    public int largestRectangleArea(int[] heights) {

        int n = heights.length;
        int left[] = new int[n];

        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {

            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                left[i] = -1;
            } else {
                left[i] = s.peek();
            }
            s.push(i);
        }

        int right[] = new int[n];

        Stack<Integer> s1 = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {

            while (!s1.isEmpty() && heights[s1.peek()] >= heights[i]) {
                s1.pop();
            }

            if (s1.isEmpty()) {
                right[i] = n;
            } else {
                right[i] = s1.peek();
            }
            s1.push(i);
        }

        int max = 0;
        for (int i = 0; i < n; i++) {

            int width = right[i] - left[i] - 1;
            int area = width * heights[i];
            max = Math.max(area, max);
        }
        return max;
    }
}