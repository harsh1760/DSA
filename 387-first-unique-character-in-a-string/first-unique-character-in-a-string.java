class Solution {
    public int firstUniqChar(String s) {
       
       HashMap<Character,Integer>mp=new HashMap<>();
       for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
       }

       for(char ch:s.toCharArray()){
            if(mp.get(ch)==1){
                return  s.indexOf(ch);
            }
       }
        return -1;
    }
}