class Solution {

    public static boolean Harsh(int n){
        
        if(n==1){
            return true;
        }

        if(n<=0 || n%3!=0){
            return false;
        }

        return Harsh(n/3);
    }
    public boolean isPowerOfThree(int n) {
        return Harsh(n);
    }
}