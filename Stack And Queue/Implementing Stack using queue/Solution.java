
//using queue implement the stack 
// 1 2 3 4 then in queue top  = 1 
//but i need top as 4 
//just reverse after append 

//offer() add , poll() remove //peek() return top() 
import java.util.*;

class MyStack {

    Queue<Integer>q;

    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.offer(x);

        //rotate it to behave as a stack
        int size = q.size();
        
        // if 1, 2, 3, 4 then top will be 1 as it is a queue 
        // but if it was a astack i need top should be 4 so reverse it 
        for(int i = 0; i < q.size() - 1; i++)
        {
            q.offer(q.poll());
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */