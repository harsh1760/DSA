class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         List<Integer> tempList = new ArrayList<>();
       
      Arrays.sort(nums1);
      Arrays.sort(nums2);

      int i=0;
      int j=0;
      int length1=nums1.length;
      int length2=nums2.length;

        while(i<length1 && j<length2){

            if(nums1[i]==nums2[j]){
                tempList.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else{
                i++;
            }

        }

         int Harsh[]=new int[tempList.size()];
         int p=0;
         for(int key:tempList){
            Harsh[p++]=key;
         }
        return Harsh;
    }
}
