class Solution {
    public int digitFrequencyScore(int n) {
        
        HashMap<Integer,Integer>mp=new HashMap<>();
        while(n>0){
            int last=n%10;
            mp.put(last,mp.getOrDefault(last,0)+1);
            n=n/10;
        }

        int sum=0;
        for(Integer h:mp.keySet()){
            int num=mp.get(h);
            sum+=h*num;
        }
        return sum;
    }
}