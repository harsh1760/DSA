class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        String[] str1 = s1.split("\\s+");
        String[] str2 = s2.split("\\s+");

        HashMap<String, Integer> mp = new HashMap<>();

        for (String s : str1) {
            mp.put(s, mp.getOrDefault(s, 0) + 1);
        }

        for (String s4 : str2) {
            mp.put(s4, mp.getOrDefault(s4, 0) + 1);
        }

        ArrayList<String> st = new ArrayList();
        for (String n : mp.keySet()) {

            int co = mp.get(n);
            if (co == 1) {
                st.add(n);
            }
        }
        String[] arr = st.toArray(new String[st.size()]);
        return arr;
    }
}