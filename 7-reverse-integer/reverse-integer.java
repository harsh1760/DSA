class Solution {
    public static int Harsh(int n) {
		
		int sign=(n<0)? -1:1;
        n=Math.abs(n);
        int reverse1=0;
        while(n>0) {
       	 	  if(reverse1>(Integer.MAX_VALUE)/10) {
			 return 0;
		 }
       	 int last=n%10;
       
       	 reverse1=reverse1*10+last;
       	 n=n / 10;
        }
        int result=reverse1*sign;
		return result;
	}
	
    public int reverse(int x) {
        return Harsh(x);
    }
}