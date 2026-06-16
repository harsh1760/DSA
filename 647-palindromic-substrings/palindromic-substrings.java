class Solution {

    public static boolean Harsh(String str){
        String str1=str;
        StringBuilder sb=new StringBuilder(str);
        String str2=sb.reverse().toString();
        return str1.equals(str2);
    }
    public int countSubstrings(String s) {
        
        int count=0;
        int k=s.length();
        for(int i=0;i<k;i++){
            for(int j=i+1;j<=k;j++){
                String str=s.substring(i,j);
                    if(Harsh(str)){
                        count++;
                    }
            }
        }
        return count;
    }
}