import java.util.ArrayDeque;
import java.util.Deque;

public class QueueUsing2Stack {
    private final Deque<Integer> st1;
    private final Deque<Integer> st2;
    public QueueUsing2Stack() {
        st1 = new ArrayDeque<>();
        st2 = new ArrayDeque<>();
    }
    public void push(int x) {
        st1.push(x);
    }
    public int pop() {
        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
        return st2.pop();
    }
    public int peek() {
        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
        return st2.peek();
    }
}
