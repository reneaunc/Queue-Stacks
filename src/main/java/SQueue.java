import java.util.*;

//*******************************************************
// SQueue: A Queue implemented using only operations from Stack
//
//*******************************************************
public class SQueue {
    // you may need to intialize some data structure here
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public void add(int x){
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        stack2.push(x);
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }
    }
    public int remove() {
        // remove this line
        if(stack1.empty()){
         System.out.println("Cannot remove from empty queue");
         return -1;
    }
    else{
        return stack1.pop();
    }
}

    public int peek() {
        // remove this line
        if(stack1.empty()){
            System.out.println("Cannot peek from empty queue");
            return -1;
        }
        else{
            return stack1.peek();
        }
    }

    public int size() {
        // remove this line
        int size = stack1.size();
        return size;
    }

    public boolean isEmpty() {
        // remove this line
        boolean empty = stack1.empty();
        return empty;
    }
    public void clear(){
        stack1.clear();
        stack2.clear();
    }
    // you are welcome to add more methods
}
