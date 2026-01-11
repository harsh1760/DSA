class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        HashSet<Integer>st=new HashSet<>();
        for(int n:arr){
            st.add(n);
        }
        int count=0;
        int i=1;
        while(true ){
            if(!st.contains(i)){
                count++;
                if(count==k){
                    return i;
                }
            }
            i++;
        }
       
    }
}