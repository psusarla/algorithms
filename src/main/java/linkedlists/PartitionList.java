package linkedlists;

public class PartitionList
{

    public void doPartition(int pivot, LinkedList inputList) {
        Node tail = getTail(inputList);
        Node currentNode = inputList.getRoot();
        Node previousNode = currentNode;
        while(currentNode.getNext() !=null) {
            if(currentNode.getValue() < pivot) {
                previousNode.setNext(currentNode.getNext());
                Node root = inputList.getRoot();
                currentNode.setNext(root);
                inputList.setRoot(currentNode);
            } {
                previousNode.setNext(currentNode.getNext());
                currentNode.setNext(null);
                tail.setNext(currentNode);
                tail = currentNode;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
    }

    private Node getTail(LinkedList inputList) {
        Node currentNode = inputList.getRoot();
        while(currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

}
