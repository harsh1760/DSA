class MinStack {
     ArrayList<Integer>ml;
    public MinStack() {
       ml =new ArrayList<>();
    }
    
    public void push(int val) {

        ml.add(val);
    }
    
    public void pop() {
        if(ml.isEmpty()){
            return ;
        }
        // int top=ml.get(ml.size()-1);
        ml.remove(ml.size()-1);
        // return top;
    }
    
    public int top() {
           if(ml.isEmpty()){
            return -1;
        }
        int top=ml.get(ml.size()-1);
             return top;
    }
    
    public int getMin() {
        int min1=ml.get(0);
        for(int i=1;i<ml.size();i++){
           
            min1=Math.min(min1,ml.get(i));
        }
        return min1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */