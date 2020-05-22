package graphs;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<Node> rootNodes;


    public Graph() {
        this.rootNodes = new ArrayList<Node>();
    }

    public List<Node> getRootNodes() {
        return rootNodes;
    }

    public void setRootNodes(List<Node> rootNodes) {
        this.rootNodes = rootNodes;
    }
}
