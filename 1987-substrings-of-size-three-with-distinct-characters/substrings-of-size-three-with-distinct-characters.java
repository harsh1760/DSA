class Solution {
    public int countGoodSubstrings(String s) {
        
        int count=0;
		 for(int i=0;i<s.length();i++) {

			 for(int j=i;j<=s.length();j++) {
				String  sub= s.substring(i,j);
				if(sub.length()==3) {
					
					String check = "";
					
					for (int k = 0; k < 3; k++) {
					    if (!check.contains(String.valueOf(sub.charAt(k)))) {
					        check += sub.charAt(k);
					    }
					    if(check.length()==3) {
					    	count++;
							}
					}
					
					}
				}
			
			 }
		 return count;
    }
}