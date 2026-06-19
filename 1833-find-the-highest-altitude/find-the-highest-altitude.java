class Solution {
    public int largestAltitude(int[] gain) {
        
        int n=gain.length;
        int arr[]=new int[n];
        int total=0;
        int max_total=0;
        
        for(int i=0;i<n;i++){
          
            total+=gain[i]; 
             max_total=Math.max( max_total,total);
        
        }
        return max_total;
    }
}