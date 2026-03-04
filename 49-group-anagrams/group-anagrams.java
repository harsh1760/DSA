class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
       HashMap<String,ArrayList<String>>mp=new HashMap<>();

       for(int i=0;i<strs.length;i++){
           char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String str=new String(ch);
            if(!mp.containsKey(str)){
               mp.put(str, new ArrayList<>());
            }
                mp.get(str).add(strs[i]);
       }

       return new ArrayList<>(mp.values());

    }
}