class Solution {
    public boolean hasMatch(String s, String p) {
        
         int idx = p.indexOf('*');

        String prefix = p.substring(0, idx);
        String suffix = p.substring(idx + 1);
       
        int start = s.indexOf(prefix);

        if(start == -1) return false;

       int end = s.indexOf(suffix, start + prefix.length());

        return end != -1;
       
    }
}