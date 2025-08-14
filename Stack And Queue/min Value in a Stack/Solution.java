/*
    How it works:
    When you push a value:
    Always push it to Main Stack.
    In Min Stack, push:
    The new value if it’s smaller or equal to the current min.
    Otherwise, push the current min again (so both stacks stay in sync).
    When you pop:
    Pop from both stacks at the same time.
    top() → Just peek at the top of the Main Stack.
    getMin() → Just peek at the top of the Min Stack.
*/

class MinStack {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> minStack = new Stack<>();


    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);

        if(minStack.isEmpty())
        {
            minStack.push(val);
        }
        else{
            if(val <= minStack.peek())
            {
                minStack.push(val);
            }
            else{
                minStack.push(minStack.peek());
            }

        }
    }
    
    public void pop() {
        st.pop();
        minStack.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minStack.peek();
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