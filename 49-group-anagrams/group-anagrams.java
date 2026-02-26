class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
       HashMap<String,ArrayList<String>>mp=new HashMap<>();

       for(int i=0;i<strs.length;i++){

            char ch[]=strs[i].toCharArray();
            Arrays.sort(ch);
            String st=new String(ch);
            if(!mp.containsKey(st)){
                mp.put(st,new ArrayList<>());
            }
            mp.get(st).add(strs[i]);
       }

       return new ArrayList<>(mp.values());
    }
}