class Solution {
    public int minimumCost(int[] cost) {
        
        Arrays.sort(cost);

            int sumcost=0;
            int count=0;
        for(int i=cost.length-1;i>=0;i--){
             count++;
                sumcost+=cost[i];
             if(count%3==0){
                sumcost-=cost[i];
             }
                

        }

        return sumcost;
    }
}