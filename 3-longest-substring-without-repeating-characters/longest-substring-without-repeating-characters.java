class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int start=0;
        int max=0;
      HashSet<Character> ss = new HashSet<>();
        for(int end=0;end<s.length();end++){
            char ch=s.charAt(end);

            while(ss.contains(ch)){
                ss.remove(s.charAt(start));
                start++;
            }
            ss.add(ch);
        max=Math.max(max,end-start+1);

        }
        return max;
    }
}