package stacksqueues;

import linkedlists.Node;

public class StackNode {
    private Stack value;
    private StackNode next;

    public StackNode(Stack value) {
        this.value = value;
    }

    public Stack getValue() {
        return value;
    }

    public void setValue(Stack value) {
        this.value = value;
    }

    public StackNode getNext() {
        return next;
    }

    public void setNext(StackNode next) {
        this.next = next;
    }
}
