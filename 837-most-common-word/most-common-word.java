class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        String ch[] = paragraph.replaceAll("[^a-zA-Z0-9]", " ").toLowerCase().split("\\s+");
        int mx = 0;
        HashMap<String, Integer> mp = new HashMap<>();
        for (int i = 0; i < ch.length; i++) {
            boolean isBanned = false;
            for (int j = 0; j < banned.length; j++) {
                if (ch[i].equals(banned[j])) {
                    isBanned = true;
                    break;
                }
            }
                if (!isBanned) {
                    mp.put(ch[i], mp.getOrDefault(ch[i], 0) + 1);
                    int nu = mp.get(ch[i]);
                    mx = Math.max(nu, mx);
                }
        }
        for (String str : mp.keySet()) {
            if (mx == mp.get(str)) {
                return str;
            }
        }
        return paragraph;
    }
}