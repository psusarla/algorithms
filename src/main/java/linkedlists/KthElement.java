package linkedlists;

public class KthElement {

    private LinkedList linkedList;

    //remove kth node from end
    public void removeKthElement(int k) {

        Node current = linkedList.getRoot();
        Node kthNode = current;

        for (int i = 0; i < k; i++) {
            kthNode = kthNode.getNext();
        }

        Node prev = current;
        while(kthNode.getNext() !=null) {
            prev = current;
            current = current.getNext();
            kthNode = kthNode.getNext();
        }


        prev.setNext(prev.getNext().getNext());
    }
}


