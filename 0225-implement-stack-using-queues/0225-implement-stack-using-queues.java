import java.util.ArrayDeque;
import java.util.Deque;

class MyStack {
    Deque<Integer> q;

    public MyStack() {
        q = new ArrayDeque<>();
    }

    public void push(int x) {
        q.addLast(x);
    }

    public int pop() {
        if (empty()) {
            throw new RuntimeException("Stack is empty");
        }
        return q.pollLast();
    }

    public int top() {
        if (empty()) {
            throw new RuntimeException("Stack is empty");
        }
        return q.peekLast();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
