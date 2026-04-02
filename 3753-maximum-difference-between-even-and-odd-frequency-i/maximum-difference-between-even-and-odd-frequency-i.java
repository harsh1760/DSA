class Solution {
    public int maxDifference(String s) {
        
        HashMap<Character,Integer>mp=new HashMap<>();
        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }

             int maxOdd = 0;
        int minEven = Integer.MAX_VALUE;

        for (int freq : mp.values()) {
            if (freq % 2 == 0) {
                minEven = Math.min(minEven, freq);
            } else {
                maxOdd = Math.max(maxOdd, freq);
            }
        }

        return maxOdd - minEven;
    }
}