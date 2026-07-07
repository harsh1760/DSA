class Solution {
    public long sumAndMultiply(int n) {

        String str = String.valueOf(n);
        int array[] = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            array[i] = str.charAt(i) - '0';
        }

        long num = 0;
       long sum = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] != 0) {
                num = num * 10 + array[i];
                sum += array[i];
            }
        }
      long result = num * sum;

        return result;
    }
}