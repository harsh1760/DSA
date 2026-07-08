class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int max=0;
        for(int n:arr){
            max=Math.max(n,max);
        }

        for(int i=0;i<arr.length;i++){

            if(arr[i]==max){
                return i;
            }
        }
        return -1;
    }
}