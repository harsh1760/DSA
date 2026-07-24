class Solution {

    public static boolean Harsh(int n){
        
        if(n==1){
            return true;
        }

        if(n<=0 || n%2!=0){
            return false;
        }

        return Harsh(n/2);
    }
    public boolean isPowerOfTwo(int n) {
        
        return Harsh(n);
    }
}