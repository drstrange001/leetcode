class MyQueue {
    Stack<Integer> inputStack = new Stack<>();
    Stack<Integer> outputStack = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        inputStack.push(x);
    }
    
    public int pop() {
        if(!outputStack.isEmpty()) return outputStack.pop();
        else {
            while(!inputStack.isEmpty()){
                int n= inputStack.pop();
                outputStack.push(n);
            }
            return outputStack.pop();
        }
    }
    
    public int peek() {
        if(!outputStack.isEmpty()) return outputStack.peek();
        else {
            while(!inputStack.isEmpty()){
                outputStack.push(inputStack.pop());
            }
            return outputStack.peek();
        }
    }
    
    public boolean empty() {
        if(inputStack.isEmpty()==true && outputStack.isEmpty()==true) return true;
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */