package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    public static boolean search(Graph graph, int in) {

        Queue<Node> queue = new LinkedList<Node>();
        for (Node node: graph.getRootNodes()) {
            queue.add(node);
        }

        while (queue.isEmpty() == false) {
            Node node = queue.remove();
            if (node.getValue() == in) {
                return true;
            }

            for (Node n : node.getChildNodes()) {
                queue.add(n);
            }
        }
       return false;
    }

    public static void main(String args[]) {
        Graph graph = new Graph();

        Node node = new Node(2);
        node.getChildNodes().add(new Node(5));
        node.getChildNodes().add(new Node(10));
        graph.getRootNodes().add(node);

        node = new Node(7);
        node.getChildNodes().add(new Node(11));
        node.getChildNodes().add(new Node(12));
        graph.getRootNodes().add(node);

        boolean result = search(graph, 5);
        System.out.println("Result for 5 is " + result);

        result = search(graph, 10);
        System.out.println("Result for 10 is " + result);

        result = search(graph, 12);
        System.out.println("Result for 12 is " + result);

        result = search(graph, 13);
        System.out.println("Result for 13 is " + result);
    }
}
