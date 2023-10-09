package graphs.graph_theory_matrix;

public class Main {
    public static void main(String[] args) {

        // Adjacency Matrix: 2D Array that stores ones and zeros to represent links (edges)
        // Number of rows == Number of columns == Number of unique nodes
        // Time complexity for checking a link 0(1) (constant)
        // Space complexity O(v^2) (node == vertex)

        Graph graph = new Graph(6);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));
        graph.addNode(new Node('F'));

        // undirected Graph

        graph.addLink(0,1);
        graph.addLink(1,0);
        graph.addLink(1,2);
        graph.addLink(2,1);
        graph.addLink(1, 5);
        graph.addLink(5,1);
        graph.addLink(2,3);
        graph.addLink(3,2);
        graph.addLink(2,5);
        graph.addLink(5,2);
        graph.addLink(3, 4);
        graph.addLink(4,3);
        graph.addLink(3,5);
        graph.addLink(5,3);
        graph.addLink(4,5);
        graph.addLink(5,4);

        graph.print();

        System.out.println(graph.checkLink(1,2));
        System.out.println(graph.checkLink(0,5));
    }
}
