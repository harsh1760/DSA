class Solution {
    public int vowelConsonantScore(String s) {

   
        int vowels = 0;
        int con = 0;
        String st = s.trim().replaceAll("[0-9]", "");
        for (int i = 0; i <st.length(); i++) {

            char ch = st.charAt(i);
            if(!Character.isLetter(ch)) continue;
            if ("aeiou".indexOf(ch) != -1) {
                vowels++;
            } else {
                con++;
            }
        }
        if (con == 0) {
            return 0;
        }

        int score = vowels / con;
        return score;
    }
}