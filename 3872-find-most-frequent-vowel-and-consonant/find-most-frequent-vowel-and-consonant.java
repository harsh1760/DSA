class Solution {
    public int maxFreqSum(String s) {
        
        HashMap<Character,Integer>mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
            int mcv=0;
            int mcv1=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
           if("aeiou".indexOf(ch)!=-1){
                int cv=mp.get(ch);
                mcv=Math.max(mcv,cv);
           }else{
              int cv1=mp.get(ch);
                mcv1=Math.max(mcv1,cv1);
           }
        }

        return mcv1+mcv;
    }
}