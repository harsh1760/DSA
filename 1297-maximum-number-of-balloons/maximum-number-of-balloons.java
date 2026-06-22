class Solution {
    public int maxNumberOfBalloons(String text) {

        int a=0,b=0,l=0,o=0,n=0;

        for(char ch:text.toCharArray()){
            if(ch=='a'){
                a++;
            }else if(ch=='b'){
                b++;
            }else if(ch=='l'){
                l++;
            }else if(ch=='o'){
                o++;
            }else if(ch=='n'){
                n++;
            }
        }

        o=o/2;
        l=l/2;


        return Math.min(Math.min(a,b),Math.min(Math.min(l,o),n));

    }
}