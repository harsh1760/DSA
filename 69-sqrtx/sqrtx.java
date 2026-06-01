class Solution {
    public int mySqrt(int x) {
        
        int left=0;
        int right=x;
        while(left<=right){

            long mid=(left+right)/2;

            if( mid*mid==x){
                return (int) mid;
            }

            if(mid*mid<x){
                left=(int)mid+1;
            }else{
                right=(int)mid-1;
            }
        }
        return right;
    }
}