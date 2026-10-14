import java.util.*;
public class StackUsing2Queue {
    Deque <Integer> inque;
    Deque <Integer> outque;

    public StackUsing2Queue() {
        inque=new ArrayDeque<>();
        outque=new ArrayDeque<>();

    }

    public void push(int x) {
        inque.add(x);
    }

    public int pop() {
        if(inque.size()!=0){
            while(inque.size()!=1){
                outque.add(inque.remove());
            }
            return inque.remove();
        }
        else{
            while(outque.size()!=1){
                inque.add(outque.remove());
            }
            return outque.remove();
        }
    }

    public int top() {
        if(inque.size()!=0){
            while(inque.size()!=1){
                outque.add(inque.remove());
            }
            int k=inque.peek();
            outque.add(inque.remove());
            return k;
        }
        else{
            while(outque.size()!=1){
                inque.add(outque.remove());
            }
            int k= outque.peek();
            inque.add(outque.remove());
            return k;
        }
    }

    public boolean empty() {
        return (inque.isEmpty()&& outque.isEmpty());
    }
}
