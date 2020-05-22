package binarytrees;

public class BinaryTree {

    public Node createBinaryTree(int[] arr, int start, int end) {
        if (end < start) return null;
        int middle = (end + start)/ 2;
        Node middleNode = new Node(arr[middle]);
        Node left = createBinaryTree(arr, start, middle - 1);
        Node right = createBinaryTree(arr, middle + 1, end);
        middleNode.setLeft(left);
        middleNode.setRight(right);
        return middleNode;
    }

    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5};
        BinaryTree binaryTree = new BinaryTree();
        Node binaryTre = binaryTree.createBinaryTree(arr, 0, 4);
        binaryTree.print(binaryTre);
    }

    private Node findDescendant(Node input) {
        if (input.getRight() != null) {
            return input.getRight();
        }



        return findDescendant(input); //getParent() actually
    }


    private void print(Node binaryTre) {
        System.out.println(binaryTre.getValue());
        if (binaryTre.getLeft() != null)
        print(binaryTre.getLeft());

        if(binaryTre.getRight() != null)
        print(binaryTre.getRight());
    }

    public boolean isBalanced(Node root) {
        if (root == null) return true;

        int diff = Math.abs(getHeight(root.getRight()) - getHeight(root.getLeft()));

        if (diff > 1) {
            return false;
        } else {
            return isBalanced(root.getRight()) && isBalanced(root.getLeft());
        }
    }

    private int getHeight(Node node) {
        if (node == null) return -1;

        return Math.max(getHeight(node.getRight())
                , getHeight(node.getLeft())) + 1;
    }
}
