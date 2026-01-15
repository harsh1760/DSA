class Solution {
    public int lengthOfLongestSubstring(String s) {

       HashSet<Character>mp=new HashSet<>();

        int right=0;
        int left=0;
        int maxlen=0;
        while(right<s.length()){
            char ch=s.charAt(right);
            if(!mp.contains(ch)){
                mp.add(ch);
                maxlen=Math.max(maxlen,(right-left )+1);
                right++;
            }else{
                mp.remove(s.charAt(left));
                left++;
            }
        }
        return maxlen;
    }
}
