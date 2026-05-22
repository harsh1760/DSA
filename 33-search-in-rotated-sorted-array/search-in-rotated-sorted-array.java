class Solution {

    public static int Harsh(int nums[], int target){

        int i = 0;
        int j = nums.length - 1;

        while(i <= j){

            if(nums[i] == target){
                return i;
            }

            if(nums[j] == target){
                return j;
            }

            i++;
            j--;
        }

        return -1;
    }

    public int search(int[] nums, int target) {

        return Harsh(nums, target);
    }
}