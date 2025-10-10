class Solution {
    public static int Harsh(int height[]){
        int max=0;
        int ls=0;
        int rt=height.length-1;
       while(ls<rt){

            int ht=Math.min(height[ls],height[rt]);
            int width=rt-ls;
            int solution=width*ht;
            max=Math.max(solution,max);

            if(height[ls]<height[rt]){
                ls++;
            }else{
                rt--;
            }
       }
        return max;
    }
    public int maxArea(int[] height) {
        return  Harsh(height);
    }
}