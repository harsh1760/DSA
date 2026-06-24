class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character>ln=new HashSet<>();
        int start=0;
        int len=0;
        for(int end=0;end<s.length();end++){

            while(ln.contains(s.charAt(end))){
                ln.remove(s.charAt(start));
                start++;
            }
            ln.add(s.charAt(end));
            
            len=Math.max(len,end-start+1);

        }
        return len;
    }
}