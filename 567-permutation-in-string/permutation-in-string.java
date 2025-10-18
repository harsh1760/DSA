class Solution {
    public boolean checkInclusion(String s1, String s2) {

        for(int i=0;i<=s2.length()-s1.length();i++) {
		
	     String str=s2.substring(i,i+s1.length());
			
			if(str.length()==s1.length()) {

				char ch[]=str.toCharArray();
				char ch1[]=s1.toCharArray();
				Arrays.sort(ch);
				Arrays.sort(ch1);

				
				if(Arrays.equals(ch1, ch)) {
				    return true;

				}
				
			
		}
	}
    return false;

    }
}