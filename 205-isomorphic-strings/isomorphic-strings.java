class Solution {

    
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>mp=new HashMap<>();
        HashMap<Character,Character>mp1=new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }

		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			char ch1=t.charAt(i);
			
			if(mp.containsKey(ch) && mp.get(ch)!=ch1 ) {
					return false;
				
			}
			if(mp1.containsKey(ch1) && mp1.get(ch1)!=ch ) {
					return false;
				
			}
				mp.put(ch, ch1);
				mp1.put(ch1, ch);
			
		}
        return true;
    }
}