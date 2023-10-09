package graphs.graph_theory_matrix;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    int[][] matrix;
    List<Node> nodes;

    public Graph(int size) {
        this.matrix = new int[size][size];
        this.nodes = new ArrayList<>();
    }

    public void addNode(Node node) {
        this.nodes.add(node);
    }

    public void addLink(int src, int dst) {
        matrix[src][dst] = 1;
    }

    public boolean checkLink(int src, int dst) {
        // src represents the row
        // dst represents the column
        return matrix[src][dst] == 1;
    }

    public void print() {
        System.out.print("  ");
        for (var node : nodes) {
            System.out.print(node.data + " ");
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + " ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
