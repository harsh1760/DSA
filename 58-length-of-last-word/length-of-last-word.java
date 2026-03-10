class Solution {
   
    public int lengthOfLastWord(String s) {
        
        String str[]=s.trim().split(" ");
        String st=str[str.length-1];
        return st.length();
    }
}