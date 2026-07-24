class Solution {

    public static int Harsh(int n){

        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
         int ans=Harsh(n-1)+Harsh(n-2);
         
        return ans;
    }
    public int fib(int n) {
        return Harsh(n);

    }
}