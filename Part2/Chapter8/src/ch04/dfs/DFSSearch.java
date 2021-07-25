package ch04.dfs;

import ch04.graph.UndirectedGraph;

import java.util.Stack;

public class DFSSearch {

    int count;
    boolean[] visited;
    Stack<Integer> stack;
    int[][] matrix;

    public DFSSearch(int count) {
        this.count = count;
        visited = new boolean[count];
        stack =  new Stack<>();
    }

    public void dfsTraversal() {
        stack.push(0);
        visited[0] = true;

        while (stack.isEmpty() != true) {
            int node = stack.pop();

            System.out.print(node + " ");

            for (int j=0; j<count; j++) {
                if (matrix[node][j] != 0 && visited[j] == false) {

                    stack.push(j);
                    visited[j] = true;
                }

            }
        }
    }
    public static void main(String[] args) {
        int count = 8;
        UndirectedGraph graph = new UndirectedGraph(count);
        graph.addEdges(0, 1, 1);
        graph.addEdges(0, 2, 1);
        graph.addEdges(3, 1, 1);
        graph.addEdges(4, 1, 1);
        graph.addEdges(2, 5, 1);
        graph.addEdges(2, 6, 1);
        graph.addEdges(4, 5, 1);
        graph.addEdges(3, 7, 1);

        DFSSearch dfs = new DFSSearch(count);
        dfs.matrix = graph.getMatrix();

        dfs.dfsTraversal();
    }
}
