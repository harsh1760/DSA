class Solution {
    public int maxProduct(int n) {
        
        ArrayList<Integer>ln=new ArrayList<>();
        while(n>0){
            int num=n%10;
           ln.add(num);
            n=n/10;            
        }

        Collections.sort(ln);
        return ln.get(ln.size()-1)*ln.get(ln.size()-2);
    }
}