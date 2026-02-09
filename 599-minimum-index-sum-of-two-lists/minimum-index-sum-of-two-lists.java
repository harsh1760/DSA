class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        HashMap<String,Integer>mp=new HashMap<>();
        for(int i=0;i<list1.length;i++){
            mp.put(list1[i],i);
        }

        ArrayList<String> ln = new ArrayList<>();

         int minSum = Integer.MAX_VALUE;

        for(int j=0;j<list2.length;j++){

                if(mp.containsKey(list2[j])){

                    int sum=j+mp.get(list2[j]);

                    if(sum<minSum){
                        ln.clear();
                        ln.add(list2[j]);
                        minSum = sum;
                    }else if(sum==minSum){
                          ln.add(list2[j]);
                      minSum = sum;
                    }
                }
        }
        return ln.toArray(new String[0]);
    }
}