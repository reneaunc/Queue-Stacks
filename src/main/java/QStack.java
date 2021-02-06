import java.rmi.server.RemoteObjectInvocationHandler;
import java.util.*;

//*******************************************************
// QStack: A Stack implemented using only operations from Queue
//
//*******************************************************
public class QStack {
    // you may need to intialize some data structure here
    Queue<Integer> queue = new LinkedList<>();
    public void push(int x) {
        queue.add(x);
        while(queue.peek() != x){
           int front = queue.peek();
            queue.remove();
            queue.add(front);
        }
    }
    
    public int pop() {
        int removed = queue.remove();
        return removed;
    }

    public int top() {
        int top = queue.element();
        return top;
    }

    public int size() {
        int size = queue.size();
        return size;
    }

    public boolean isEmpty() {
        if (queue.peek() == null){
            return true;
        }
        else{
            return false;
        }
    }
    public void clear(){
        while(queue.peek() != null){
            queue.remove();
        }
    }
    // you are welcome to add more methods
}
