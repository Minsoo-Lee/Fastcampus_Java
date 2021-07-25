package ch04.bfs;

import ch04.graph.UndirectedGraph;

import java.util.ArrayList;

public class BfSSearch {
    int count;
    boolean[] visited;
    ArrayList<Integer> queue;
    int[][] matrix;

    public BfSSearch(int count) {
        this.count = count;
        visited = new boolean[count];
        queue = new ArrayList<>();
    }

    public void bfsTraversal() {
        queue.add(0);
        visited[0] = true;

        while (queue.size() != 0) {
            int node = queue.remove(0);
            System.out.print(node + " ");
            for (int j=0; j<count; j++) {
                if (matrix[node][j] != 0 && !visited[j]) {
                    queue.add(j);
                    visited[j] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int count = 8;
        UndirectedGraph graph = new UndirectedGraph(count);
        BfSSearch bfs = new BfSSearch(count);

        graph.addEdges(0, 1, 1);
        graph.addEdges(0, 2, 1);
        graph.addEdges(3, 1, 1);
        graph.addEdges(4, 1, 1);
        graph.addEdges(2, 5, 1);
        graph.addEdges(2, 6, 1);
        graph.addEdges(4, 5, 1);
        graph.addEdges(3, 7, 1);

        bfs.matrix = graph.getMatrix();
        bfs.bfsTraversal();
    }
}
