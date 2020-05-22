package graphs;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private int value;
    private List<Node> childNodes = null;

    public Node(int value) {
        this.value = value;
        childNodes = new ArrayList<Node>();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<Node> getChildNodes() {
        return childNodes;
    }

    public void setChildNodes(List<Node> childNodes) {
        this.childNodes = childNodes;
    }
}
