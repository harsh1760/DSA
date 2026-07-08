class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer>s=new Stack<>();

        for(int i=0;i<asteroids.length;i++){

            int elem=asteroids[i];

            while(!s.isEmpty() && elem<0 && s.peek()>0){
              
                if(s.peek()<-elem){
                    s.pop();
                }else if(s.peek()==-elem){
                    s.pop();
                    elem=0;
                    break;
                }else{
                    elem=0;
                    break;                    
                }
            }
            if(elem !=0) s.push(elem);            
        }

        int arr[]=new int[s.size()];
        for(int i=s.size()-1;i>=0;i--){
            arr[i]=s.pop();
        }
        return arr;
    }
}