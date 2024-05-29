package CodeLab2;

import java.util.*;

public class CodeLab_DFS {
    private LinkedList<Integer> adj[];
    private boolean visited[];

    CodeLab_DFS(int V) {
        adj = new LinkedList[V];
        visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    void insertEdge(int src, int dest) {
        adj[src].add(dest);
    }

    void DFS(int vertex) {
        visited[vertex] = true;
        System.out.println(vertex + " ");

        Iterator<Integer> it = adj[vertex].listIterator();
        while (it.hasNext()) {
            int n = it.next();
            if (!visited[n]) {
                DFS(n);
            }
        }
    }

    public static void main(String[] args) {
        CodeLab_DFS graph = new CodeLab_DFS(6);

        graph.insertEdge(3, 2);
        graph.insertEdge(2, 1);
        graph.insertEdge(2, 4);
        graph.insertEdge(1, 5);
        graph.insertEdge(1, 0);
        graph.insertEdge(4, 5);
        graph.insertEdge(4, 0);
        graph.insertEdge(5, 0);
        graph.insertEdge(0, 1);
        graph.insertEdge(0, 4);
        graph.insertEdge(0, 5);
        graph.insertEdge(5, 1);
        graph.insertEdge(5, 4);
        graph.insertEdge(5, 1);
        graph.insertEdge(1, 2);
        graph.insertEdge(4, 2);
        graph.insertEdge(2, 3);

        System.out.println("DFS for the graph is: ");
        graph.DFS(3);
    }
}
