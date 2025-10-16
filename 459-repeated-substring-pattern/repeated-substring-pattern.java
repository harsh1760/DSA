class Solution {

    public static boolean Harsh(String s) {
		String hp=s+s;
		  return hp.substring(1,hp.length()-1).contains(s);
	}
    public boolean repeatedSubstringPattern(String s) {
        return Harsh(s);
    }
}