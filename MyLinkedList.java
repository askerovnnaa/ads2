import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

    public class MyLinkedList<T> implements MyList<T> {
        private class MyNode {
            T data;
            MyNode next;
            MyNode prev;

            MyNode(T data) {
                this.data = data;
            }
        }

        private MyNode head;
        private MyNode tail;
        private int size;


        public MyLinkedList() {
            head = null;
            tail = null;
            size = 0;
        }
        @Override
        public void add(T newItem) {
            MyNode newNode = new MyNode(newItem);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
            size++;
        }

        @Override
        public void set(int index, T item) {
            checkIndex(index);
            MyNode current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.data = item;
        }

        @Override
        public void add(int index, T item) {
            checkIndexForAdd(index);
            if (index == 0) {
                addFirst(item);
            } else if (index == size) {
                addLast(item);
            } else {
                MyNode newNode = new MyNode(item);
                MyNode current = head;
                for (int i = 0; i < index; i++) {
                    current = current.next;
                }
                newNode.next = current;
                newNode.prev = current.prev;
                if (current.prev != null) {
                    current.prev.next = newNode;
                }
                current.prev = newNode;
                size++;
            }
        }

        @Override
        public void addFirst(T item) {
            MyNode newNode = new MyNode(item);
            if (head == null) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            size++;
        }

        @Override
        public void addLast(T item) {
            add(item);
        }

        @Override
        public T get(int index) {
            checkIndex(index);
            MyNode current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.data;
        }

        @Override
        public T getFirst() {
            if (head == null) throw new IllegalStateException("List is empty");
            return head.data;
        }

        @Override
        public T getLast() {
            if (tail == null) throw new IllegalStateException("List is empty");
            return tail.data;
        }

        @Override
        public void remove(int index) {
            checkIndex(index);
            if (index == 0) {
                removeFirst();
            } else if (index == size - 1) {
                removeLast();
            } else {
                MyNode current = head;
                for (int i = 0; i < index; i++) {
                    current = current.next;
                }
                current.prev.next = current.next;
                current.next.prev = current.prev;
                size--;
            }
        }

        @Override
        public void removeFirst() {
            if (head == null) throw new IllegalStateException("List is empty");
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            size--;
        }

        @Override
        public void removeLast() {
            if (tail == null) throw new IllegalStateException("List is empty");
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
            size--;
        }

        @Override
        public void sort() {

        }

        @Override
        public int indexOf(Object object) {
            MyNode current = head;
            int index = 0;
            while (current != null) {
                if (current.data.equals(object)) {
                    return index;
                }
                current = current.next;
                index++;
            }
            return -1;
        }

        @Override
        public int lastIndexOf(Object object) {
            MyNode current = tail;
            int index = size - 1;
            while (current != null) {
                if (current.data.equals(object)) {
                    return index;
                }
                current = current.prev;
                index--;
            }
            return -1;
        }

        @Override
        public boolean exists(Object object) {
            return indexOf(object) != -1;
        }

        @Override
        public Object[] toArray() {
            Object[] array = new Object[size];
            MyNode current = head;
            int index = 0;
            while (current != null) {
                array[index++] = current.data;
                current = current.next;
            }
            return array;
        }

        @Override
        public void clear() {
            head = tail = null;
            size = 0;
        }

        @Override
        public int size() {
            return size;
        }

        private void checkIndex(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }
        }

        private void checkIndexForAdd(int index) {
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }
        }

        @Override
        public Iterator<T> iterator() {
            return new MyIterator();
        }

        // Inner class for Iterator implementation
        private class MyIterator implements Iterator<T> {
            private MyNode current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T data = current.data;
                current = current.next;
                return data;
            }
        }
        }

