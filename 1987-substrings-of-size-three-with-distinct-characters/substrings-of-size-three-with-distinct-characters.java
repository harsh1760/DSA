class Solution {
    public int countGoodSubstrings(String s) {

      int n=s.length();
      int count=0;
      for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                String str=s.substring(i,j);
                if(str.length()==3){
                    String check="";
                    for(int k=0;k<str.length();k++){

                      if (!check.contains(String.valueOf(str.charAt(k)))) {
                            check+=str.charAt(k);
                        }

                        if(check.length()==3){
                            count++;
                        }
                    }
                }
            }
      }  

      return count;
      
    }
}