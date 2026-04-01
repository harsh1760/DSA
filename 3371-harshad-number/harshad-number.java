class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        
        int origin=x;
        int add=0;
        while(x>0){

            int last=x%10;
            add=add+last;
            x=x/10;
        }

       
        if(origin %add==0){
            return add;
        }else{
            return -1;
        }
    }
}