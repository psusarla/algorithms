package linkedlists;

public class LinkedList {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void addNode(Node in) {
        if (root == null) {
            root = in;
        } else {
            Node currentNode = root;
            if (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(in);
        }
    }

}

