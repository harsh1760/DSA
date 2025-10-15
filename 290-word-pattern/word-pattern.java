class Solution {
    public boolean wordPattern(String pattern, String s) {

        
        
        String Harsh[]=s.split(" ");
        if(pattern.length()!=Harsh.length ){
            return false;
        }

        HashMap<Character,String>mp=new HashMap<>();
        HashMap<String,Character>mp1=new HashMap<>();
        for(int i=0;i<pattern.length();i++){

            char ch=pattern.charAt(i);
            String str=Harsh[i];
            if(mp.containsKey(ch) && !mp.get(ch).equals(str)){
                return false;
            }
            if(mp1.containsKey(str) && mp1.get(str)!=ch){
                return false;
            }
            mp.put(ch,str);
            mp1.put(str,ch);
        }
        return true;
    }
}