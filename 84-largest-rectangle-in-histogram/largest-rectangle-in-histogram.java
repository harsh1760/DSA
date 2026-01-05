class Solution {
    public int largestRectangleArea(int[] heights) {

        if(heights.length==1){
            return heights[heights.length-1];
        }
        int maxare=0;
        Stack<Integer> sk=new Stack<>();
        int left[]=new int[heights.length];
        int right[]=new int[heights.length];

        for(int i=heights.length-1;i>=0;i--){
            while(!sk.isEmpty() && heights[sk.peek()]>=heights[i]){
                sk.pop();
            }

            if(sk.isEmpty()){
                right[i]=heights.length;
            }else{
                right[i]=sk.peek();

            }
            sk.push(i);
        }

        sk=new Stack<>();
        for(int i=0;i<heights.length;i++){
            while(!sk.isEmpty() && heights[sk.peek()]>=heights[i]){
                sk.pop();
            }

            if(sk.isEmpty()){
                left[i]=-1;
            }else{
                left[i]=sk.peek();

            }
            sk.push(i);
        }

        for(int i=0;i<heights.length;i++){
            int h=heights[i];
            int width=right[i]-left[i]-1;
            int total=h*width;
            maxare=Math.max(maxare,total);
        }
        return  maxare;
    }
}