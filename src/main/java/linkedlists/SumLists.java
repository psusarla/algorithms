package linkedlists;

public class SumLists
{
    public static void main (String args[]) {

        SumLists sumLists = new SumLists();

        LinkedList inputA = new LinkedList();
        inputA.addNode(new Node(8));
        inputA.addNode(new Node(3));
        inputA.addNode(new Node(7));

        LinkedList inputB = new LinkedList();
        inputB.addNode(new Node(4));
        inputB.addNode(new Node(5));
        inputB.addNode(new Node(2));

        LinkedList result = sumLists.sum(inputA, inputB);
        sumLists.print(result);
    }

    private void print(LinkedList result) {
        Node current = result.getRoot();
        if (current == null) {
            System.out.print("EMPTY LIST");
            return;
        }

        while (current != null) {
            System.out.print(current.getValue() + " , ");
            current = current.getNext();

        }
        System.out.println(" END");
    }


    public LinkedList sum(LinkedList inputA, LinkedList inputB) {
        LinkedList result = new LinkedList();
   //     result.setRoot(new Node(0));
        Node sum = result.getRoot();
        Node nodeA = inputA.getRoot();
        Node nodeB = inputB.getRoot();
        int remainder = 0;
        while((nodeA != null) && (nodeB != null)) {
            int total =  nodeA.getValue() + nodeB.getValue() + remainder;
            int val = 0;
            if ( total >= 10) {
                remainder = 1;
                val = total - 10;
            } else {
                remainder = 0;
                val = total;
            }
            result.addNode(new Node(val));
            nodeA = nodeA.getNext();
            nodeB = nodeB.getNext();
        }

        if(nodeA == null) {
            while (nodeB != null) {
                int total = nodeB.getValue() + remainder;
                int val = 0;
                if (total >= 10) {
                    remainder = 1;
                    val = total - 10;
                } else {
                    remainder = 0;
                    val = total;
                }
                result.addNode(new Node(val));
                nodeB = nodeB.getNext();
            }
        }else if (nodeB == null) {
            while (nodeA != null) {
                int total = nodeA.getValue() + remainder;
                int val = 0;
                if (total >= 10) {
                    remainder = 1;
                    val = total - 10;
                } else {
                    remainder = 0;
                    val = total;
                }
                result.addNode(new Node(val));
                nodeA = nodeA.getNext();

            }
        }

        return result;
    }


}
