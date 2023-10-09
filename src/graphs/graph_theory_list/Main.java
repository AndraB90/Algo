package graphs.graph_theory_list;

public class Main {
    public static void main(String[] args) {
        DirectedGraph directedGraph = new DirectedGraph();
        directedGraph.addNodes(new Node('A'));
        directedGraph.addNodes(new Node('B'));
        directedGraph.addNodes(new Node('C'));
        directedGraph.addNodes(new Node('D'));
        directedGraph.addNodes(new Node('E'));
        directedGraph.addNodes(new Node('F'));

        directedGraph.addLink(0,1);
        directedGraph.addLink(1,2);
        directedGraph.addLink(1,5);
        directedGraph.addLink(2,3);
        directedGraph.addLink(2,4);
        directedGraph.addLink(4,5);
        directedGraph.addLink(5,0);

        directedGraph.print();
    }
}
