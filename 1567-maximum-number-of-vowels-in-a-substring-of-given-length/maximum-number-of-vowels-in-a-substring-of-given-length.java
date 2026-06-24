class Solution {
    public int maxVowels(String s, int k) {
        
        int start=0;
      int count=0;
        int max=0;
        for(int end=0;end<s.length();end++){
            char ch=s.charAt(end);

            if("aeiou".indexOf(ch)!=-1){
                count++;
            }

            if(end-start+1==k){
               
                max = Math.max(max, count);
               char ch1=s.charAt(start);
                if("aeiou".indexOf(ch1)!=-1){
                count--;
            }

               start++;

                }
            }
        return max;
        }
    }
