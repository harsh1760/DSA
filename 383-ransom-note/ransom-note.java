class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

       HashMap<Character,Integer>mp=new HashMap<>();
       HashMap<Character,Integer>mp1=new HashMap<>();

       for(int i=0;i<ransomNote.length();i++){
        char ch=ransomNote.charAt(i);
        mp.put(ch,mp.getOrDefault(ch,0)+1);
       }
       for(int i=0;i<magazine.length();i++){
        char ch=magazine.charAt(i);
        mp1.put(ch,mp1.getOrDefault(ch,0)+1);
       }

       for(char ch:mp.keySet()){

            int count=mp.get(ch);
            int count1=mp1.getOrDefault(ch,0);
            if(count1<count){
                return false;
            }
       }
        return true;
    }
}