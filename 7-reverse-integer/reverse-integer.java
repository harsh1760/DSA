class Solution {
    public int reverse(int x) {
        
        int sign=(x>0)? 1:-1;
        int ori=Math.abs(x);

    long rev=0;
        while(ori>0){
            int l=ori%10;
            rev=rev*10+l;

             if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0;
            }
            ori=ori/10;
        }
        return  (int)rev*sign;
    }
}