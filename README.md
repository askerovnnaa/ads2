1. MyArrayList

Core Methods:
add(T item)

Adds an element to the end of the array.
If the array is full, it increases its capacity using the ensureCapacity method.
set(int index, T item)

Replaces the element at the specified index with a new element.
Throws an IndexOutOfBoundsException if the index is invalid.
add(int index, T item)

Inserts an element at the specified position, shifting all subsequent elements to the right.
Validates the index using checkIndexForAdd.
addFirst(T item)

Inserts an element at the beginning of the array by calling add(0, item).
addLast(T item)

Adds an element to the end of the array by calling add(item).
get(int index)

Returns the element at the specified index.
Validates the index using checkIndex.
getFirst()

Returns the first element in the array.
getLast()

Returns the last element in the array.
remove(int index)

Removes the element at the specified index and shifts all subsequent elements to the left.
removeFirst()

Removes the first element in the array.
removeLast()

Removes the last element in the array.
sort()

Sorts the elements in the array, assuming T implements Comparable.
indexOf(Object object)

Returns the index of the first occurrence of the specified element. Returns -1 if the element does not exist.
lastIndexOf(Object object)

Returns the index of the last occurrence of the specified element.
exists(Object object)

Checks if the specified element exists in the array.
toArray()

Converts the array to a standard Object[].
clear()

Removes all elements from the array.
size()

Returns the number of elements in the array.
2. MyLinkedList
This class implements a doubly linked list. Methods:

Core Methods:
add(T item)

Adds an element to the end of the list.
set(int index, T item)

Replaces the element at the specified position with a new one.
add(int index, T item)

Inserts an element at the specified index.
addFirst(T item)

Adds an element at the beginning of the list.
addLast(T item)

Adds an element to the end of the list.
get(int index)

Returns the element at the specified index.
getFirst()

Returns the first element in the list.
getLast()

Returns the last element in the list.
remove(int index)

Removes the element at the specified index.
removeFirst()

Removes the first element in the list.
removeLast()

Removes the last element in the list.
sort()

Sorts the list (e.g., using Merge Sort or Bubble Sort for linked lists).
indexOf(Object object)

Returns the index of the first occurrence of the specified element.
lastIndexOf(Object object)

Returns the index of the last occurrence of the specified element.
exists(Object object)

Checks if the specified element exists in the list.
toArray()

Converts the list to an array.
clear()

Removes all elements from the list.
size()

Returns the number of elements in the list.
3. MyQueue
Implements the "Queue" data structure (FIFO). Methods:

enqueue(T item)

Adds an element to the end of the queue.
dequeue()

Removes and returns the element from the front of the queue.
Throws an IllegalStateException if the queue is empty.
peek()

Returns the element at the front of the queue without removing it.
Returns null if the queue is empty.
isEmpty()

Checks if the queue is empty.
size()

Returns the number of elements in the queue.
4. MyStack
Implements the "Stack" data structure (LIFO). Methods:

push(T item)

Adds an element to the top of the stack.
pop()

Removes and returns the element from the top of the stack.
Throws an EmptyStackException if the stack is empty.
peek()

Returns the element at the top of the stack without removing it.
Throws an EmptyStackException if the stack is empty.
isEmpty()

Checks if the stack is empty.
size()

Returns the number of elements in the stack.
5. MyMinHeap
Implements the "Min-Heap" data structure using an array. Methods:

Public Methods:
empty()

Checks if the heap is empty.
size()

Returns the number of elements in the heap.
getMin()

Returns the minimum element (root of the heap) without removing it.
Throws an exception if the heap is empty.
extractMin()

Removes and returns the minimum element (root of the heap).
Throws an exception if the heap is empty.
insert(T item)

Adds a new element to the heap and restores the heap property.
Private Methods:
heapify(int index)

Restores the heap property starting from the specified index.
traverseUp(int index)

Moves an element up the heap to restore the heap property.
leftChildOf(int index)

Returns the index of the left child.
rightChildOf(int index)

Returns the index of the right child.
parentOf(int index)

Returns the index of the parent for the specified index.
swap(int index1, int index2)

Swaps two elements in the heap by their indices.
