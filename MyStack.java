import java.util.EmptyStackException;

public class MyStack<T> {
    private MyArrayList<T> stack;


    public MyStack() {
        stack = new MyArrayList<>();
    }


    public void push(T item) {
        stack.addLast(item);
    }


    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T item = stack.getLast();
        stack.removeLast();
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.getLast();
    }


    public boolean isEmpty() {
        return stack.size() == 0;
    }


    public int size() {
        return stack.size();
    }
}
