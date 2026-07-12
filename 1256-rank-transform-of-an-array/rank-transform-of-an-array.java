class Solution {
    public int[] arrayRankTransform(int[] arr) {
      
        int sorted[]=arr.clone();
        Arrays.sort(sorted);
        int r=1;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int num:sorted){
           
           if(!mp.containsKey(num)){
             mp.put(num,r++);

           }
        }

        for(int  i=0;i<arr.length;i++){
            arr[i]=mp.get(arr[i]);
        }
        return arr;
    }
}