class Solution {
    public static char Harsh(String s){
    
    HashMap<Character,Integer>mp=new HashMap<>();
    for(char ch:s.toCharArray()){
        mp.put(ch,mp.getOrDefault(ch,0)+1);
        if(mp.get(ch)==2){
          return ch; 
          
       }
    }
        
    
    return ' ';
    }
    public char repeatedCharacter(String s) {
        return Harsh(s);
        
    }
}