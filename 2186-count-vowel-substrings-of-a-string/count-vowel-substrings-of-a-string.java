class Solution {
    public static int Harsh(String word) {

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                String substr = word.substring(i, j);
                if (Goat(substr)) {
                    count++;
                }
            }
        }
        return count;

    }

    public static boolean Goat(String st) {

        if (!st.matches("[aeiou]+")) {
            return false;
        }
        return st.contains("a") &&
                st.contains("e") &&
                st.contains("i") &&
                st.contains("o") &&
                st.contains("u");
    }

    public int countVowelSubstrings(String word) {

        return Harsh(word);

    }
}