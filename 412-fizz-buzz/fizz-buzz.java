class Solution {
    public List<String> fizzBuzz(int n) {
        
        List<String> ln = new ArrayList<>();

        for(int i=1;i<=n;i++){

            if(i%3==0 && i%5==0){
                ln.add("FizzBuzz");
            }else if(i%3==0){
                  ln.add("Fizz");
            }else if(i%5==0){
                  ln.add("Buzz");
            }else{
                  ln.add(String.valueOf(i));
            }
        }
        return ln;
    }
}