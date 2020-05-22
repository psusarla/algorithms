package stacksqueues;

import linkedlists.Node;

public class Stack {
    private Node top;

    private int size = 0;
    public Node getTop() {
        return top;
    }

    public Stack() {
        top = null;
        size = 0;
    }

    public void push(Node in) {
       in.setNext(top);
       top = in;
       size++;
    }

    public Node pop() {
        Node ret = top;
        top = top.getNext();
        size--;
        return ret;
    }

    public Node peek() {
        return top;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void print(Stack stack) {
        Node top = stack.getTop();
        System.out.println("Printing stack");
        print(top);
        System.out.println("END");
    }

    public int getSize() {
        return size;
    }

    public void print(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.getValue() + " ");
        print(node.getNext());
    }

    public static void main(String args[]) {
        Stack stack = new Stack();
        stack.push(new Node(2));
        stack.push(new Node(4));
        stack.push(new Node(5));
        stack.push(new Node(6));
        stack.print(stack);
    }
}