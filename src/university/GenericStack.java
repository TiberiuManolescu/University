package university;

public class GenericStack<T> {
    private T[] stack;
    private int top;
    private int size;

    // Constructor to create a stack of specified size
    public GenericStack(int size) {
        this.size = size;
        stack = (T[]) new Object[size];
        top = -1;
    }

    // Method to add an element to the top of the stack
    public void push(T element) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        stack[++top] = element;
    }

    // Method to remove and return the element at the top of the stack
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T element = stack[top--];
        return element;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == size - 1;
    }

    // Method to return the element at the top of the stack without removing it
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T element = stack[top];
        return element;
    }
}
