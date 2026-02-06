class Solution {
    public String reverseOnlyLetters(String s) {
        
        char[] array=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){

            if(!Character.isLetter(array[i])){
                i++;
            }else if(!Character.isLetter(array[j])){
                j--;
            }else{
                char temp=array[i];
                array[i]=array[j];
                array[j]=temp;
                i++;
                j--;
            }
        }
        return new String(array);
    }
}