import java.util.*;

class Solution {
    public List<String> stringMatching(String[] words) {

        ArrayList<String> st = new ArrayList<>();

        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words.length; j++){

                if(i != j && words[j].contains(words[i])){
                    st.add(words[i]);
                    break;
                }

            }
        }

        return st;
    }
}