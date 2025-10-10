class Solution {
    public static boolean Harsh(int arr[]){

        int total=0;
        for(int ar:arr){
            total+=ar;
        }

        if(total % 3 != 0){
            return false;
        }
        int part=total/3;
        int sum=0;
        int count=0;
        for(int arr2:arr){
            sum+=arr2;
            if(sum==part){
                sum=0;
                count++;
            }

        }

        return count>=3;
      
    }
    public boolean canThreePartsEqualSum(int[] arr) {
        return Harsh(arr);
    }
}