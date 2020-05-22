package stacksqueues;

import linkedlists.Node;

public class Queue {
    private Node first = null;
    private Node last = null;

    public void enqueue(Node node) {
        if (first == null) {
            first = node;
            last = node;
            return;
        }

        last.setNext(node);
        last = node;
    }

    public Node dequeue() {
      Node ret = first;
      first = first.getNext();
      return ret;
    }

    public Node peek() {
        return first;
    }

    public boolean isEmpty() {
      return first == null;
    }

    public void print() {
        print(first);
        System.out.println();
    }

    public void print(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.getValue() + " ");
        print(node.getNext());
    }

    public static void main (String args[]) {
        Queue queue = new Queue();
        queue.enqueue(new Node(2));
        queue.enqueue(new Node(4));
        queue.enqueue(new Node(7));
        queue.enqueue(new Node(9));
        queue.print();

        Node node = queue.dequeue();
        System.out.println("Dequeued " + node.getValue());

        node = queue.dequeue();
        System.out.println("Dequeued " + node.getValue());

        queue.print();
    }
}