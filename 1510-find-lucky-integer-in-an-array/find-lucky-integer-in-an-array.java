class Solution {
    public int findLucky(int[] arr) {
        
        HashMap<Integer,Integer>mp=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }

            int ans=-1;
        for(int n:mp.keySet()){

            
            if(mp.get(n)==n){
                ans=Math.max(-1,n);
            }
        }
                return ans;
    }
}