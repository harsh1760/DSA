class Solution {
    public int alternateDigitSum(int n) {

     int temp=n;
     int count=0;

     while(temp>0){
        temp/=10;
        count++;
     }   

     int arr[]=new int[count];
     for(int i=count-1;i>=0;i--){
        arr[i]=n%10;
        n/=10;
     }

        int total=0;
      
           for (int i = 0; i < arr.length; i++){

            if (i % 2 == 0) {
                total += arr[i];  
            } else {
                total -= arr[i]; 
            }
        }
        return total;
    }
}