class Solution {
    public int[] sortEvenOdd(int[] nums) {
 
        if(nums.length<2){
            return nums;
        }

        ArrayList<Integer>mp=new ArrayList<>();
        ArrayList<Integer>mp1=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                mp.add(nums[i]);
            }else{
                  mp1.add(nums[i]);
            }
        }
        
        Collections.sort(mp);
        Collections.sort(mp1,Collections.reverseOrder());
        int kp[]=new int[nums.length];
        int k=0;
        int l=0;
        for(int i=0;i<nums.length;i++){

            if(i%2==0){
                kp[i]=mp.get(k++);
            }else{
                kp[i]=mp1.get(l++);
            }
        }
        return kp;
    }
}