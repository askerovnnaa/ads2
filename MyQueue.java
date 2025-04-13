public class MyQueue<T> {
    private MyLinkedList<T> queue;


    public MyQueue() {
        queue = new MyLinkedList<>();
    }


    public void enqueue(T item) {
        queue.addLast(item);
    }


    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T item = queue.getFirst();
        queue.removeFirst();
        return item;
    }


    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return queue.getFirst();
    }


    public boolean isEmpty() {
        return queue.size() == 0;
    }


    public int size() {
        return queue.size();
    }
}
