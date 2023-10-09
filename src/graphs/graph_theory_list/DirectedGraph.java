package graphs.graph_theory_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DirectedGraph {
    List<LinkedList<Node>> adjacentList;

    public DirectedGraph() {
        this.adjacentList = new ArrayList<>();
    }

    public void addNodes(Node node){
        // First declare the element container represented by a linked list
        LinkedList<Node> linkedList = new LinkedList<>();
        // Add node to container
        linkedList.add(node);
        // Add the container to the adjacent list
        adjacentList.add(linkedList);
    }

    public void addLink(int src, int dst){
        // First declare the element container represented by a linked list
        LinkedList<Node> tempList = adjacentList.get(src);
        Node dstNode = adjacentList.get(dst).get(0);
        // Now we add the destination node to the tail of the temp list
        tempList.add(dstNode);
    }

    public void print(){
        for (var ll: adjacentList) {
            for (var node: ll) {
                System.out.print(node.data+" -> ");
            }
            System.out.println();
        }
    }


}
