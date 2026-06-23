class Solution {
    public boolean isHappy(int n) {
        
       HashSet<Integer>m=new HashSet<>();

       while(n!=1 && !m.contains(n) ){
             m.add(n);
            int sum=0;
            while(n>0){

                int last=n%10;
                sum+=last*last;
           
                n=n/10;
            }
            n=sum;
        }
  
                return n==1;
    }
}