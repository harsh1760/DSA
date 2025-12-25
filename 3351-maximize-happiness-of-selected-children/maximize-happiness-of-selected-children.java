class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        
        Arrays.sort(happiness);
        if(k==1){
            return happiness[happiness.length-1];
        }
        long total=0;
        int l=0;
        for(int i=happiness.length-1;i>=happiness.length-k;i--){
            int val=happiness[i];
            total+= Math.max(0,val-l);
            l++;
        }
        return total;
    }
}