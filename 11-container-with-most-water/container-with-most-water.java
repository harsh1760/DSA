class Solution {
    public static int Harsh(int height[]){
        int max=0;
        int lf=0;
        int rs=height.length-1;
        while(lf<rs){
            int min=Math.min(height[lf],height[rs]);
            int width=rs-lf;
            int solution=min*width;
            max=Math.max(solution,max);
            if(height[lf]<height[rs]){
                lf++;
            }else{
                rs--;
            }

        }
        return max;
    }
    public int maxArea(int[] height) {
        return  Harsh(height);
    }
}