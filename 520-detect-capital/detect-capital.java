class Solution {
    public boolean detectCapitalUse(String word) {
        
        String str=word;
       String str1=str.toUpperCase();
       String str2=str.toLowerCase();
       String str3=Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
       

     return str.equals(str1)  || str.equals(str2) || str.equals(str3);
    }
}