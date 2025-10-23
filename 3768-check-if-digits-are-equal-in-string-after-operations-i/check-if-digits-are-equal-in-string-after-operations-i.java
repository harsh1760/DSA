class Solution {
    public static boolean Harsh(String s) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> newlist = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            int na = s.charAt(i) - '0';
            list.add(na);
        }

        while (true) {

            if (list.size() == 2 && list.get(0).equals(list.get(1))
                    || newlist.size() == 2 && newlist.get(0).equals(newlist.get(1))) {
                return true;

            }

            if (!list.isEmpty()) {
                newlist.clear();
                for (int i = 0; i < list.size() - 1; i++) {
                    int kl = (list.get(i) + list.get(i + 1)) % 10;
                    newlist.add(kl);

                }
                list.clear();
            } else if (!newlist.isEmpty()) {

                for (int i = 0; i < newlist.size() - 1; i++) {
                    int kl = (newlist.get(i) + newlist.get(i + 1)) % 10;
                    list.add(kl);

                }
                newlist.clear();
            }

            if (list.size() <= 1 && newlist.size() <= 1) {
                return false;

            }

        }

    }

    public boolean hasSameDigits(String s) {

        return Harsh(s);

    }
}