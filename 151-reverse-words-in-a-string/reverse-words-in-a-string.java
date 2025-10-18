class Solution {

public static String Harsh(String str) {
		
		int n=str.length();
		String[] str1= str.trim().split("\\s+");		
		int first=0;
		int end=str1.length-1;
		while(first<end) {
			
		String temp=str1[first];
		str1[first]=str1[end];
		str1[end]=temp;
		
		first++;
		end--;
			
		}
		
		String result = String.join(" ", str1);
        return result;
	}


    public String reverseWords(String s) {
        return Harsh(  s);
    }
}