class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i : arr) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }

        HashSet<Integer> mp1 = new HashSet<>();

        for (int j : mp.keySet()) {
            int number = mp.get(j);

            if (mp1.contains(number)) {
                return false;   
            }

            mp1.add(number);
        }

        return true;  

    }
}