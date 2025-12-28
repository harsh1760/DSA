class Solution {
    public int maximumCount(int[] nums) {

        int pos=0;
        int n=0;

        for(int x:nums){

            if(x<0){
                n++;
            }else if(x>0){
                pos++;

            }
        }

        int m=Math.max(pos,n);
        return m;
    }
}