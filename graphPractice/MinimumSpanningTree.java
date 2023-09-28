package graphPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Edges  {

    private int node1;
    private int node2;
    private int weight;

    public Edges(int node1, int node2, int weight) {
        super();
        this.node1 = node1;
        this.node2 = node2;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Edges [node1= " + (char)(node1+65) + ", node2= " + (char)(node2+65) + ", weight= " + weight + "]\n";
    }

    public int getNode1() {
        return node1;
    }

    public void setNode1(int node1) {
        this.node1 = node1;
    }

    public int getNode2() {
        return node2;
    }

    public void setNode2(int node2) {
        this.node2 = node2;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

//    @Override
//    public int compareTo(Edges o) {
//        if (this.weight < o.weight) {
//            return -1;
//        }
//        if (this.weight > o.weight) {
//            return 1;
//        }
//        return 0;
//    }
}

public class MinimumSpanningTree {

    static List<Edges> prims(int costMatrix[][]) {
        int numNodes = costMatrix.length;
        boolean[] visited = new boolean[numNodes];
        int[] dist = new int[numNodes];
        Arrays.fill(dist, 99);
        int[] parent = new int[numNodes];
        Arrays.fill(parent, -1);

        int start = 0;
        dist[start] = 0;

        List<Edges> minSpanTree = new ArrayList<>();

        for (int count = 0; count < numNodes - 1; count++) {
            int min = 99;
            int i = -1;

            for (int j = 0; j < numNodes; j++) {
                if (!visited[j] && dist[j] < min) {
                    min = dist[j];
                    i = j;
                }
            }

            if (i != -1) {
                visited[i] = true;

                for (int j = 0; j < numNodes; j++) {
                    if (!visited[j] && costMatrix[i][j] != 99 && costMatrix[i][j] < dist[j]) {
                        parent[j] = i;
                        dist[j] = costMatrix[i][j];
                    }
                }
            }
        }

        for (int i = 1; i < numNodes; i++) {
            minSpanTree.add(new Edges(parent[i], i, costMatrix[i][parent[i]]));
        }

        return minSpanTree;
    }

    public static void main(String[] args) {

        int costMatrix[][] = {
                {99, 8, 2, 4, 99, 99, 99, 99},
                {8, 99, 99, 6, 4, 99, 99, 99},
                {2, 99, 99, 2, 99, 99, 3, 99},
                {4, 6, 2, 99, 3, 9, 99, 99},
                {99, 4, 99, 3, 99, 99, 99, 2},
                {99, 99, 99, 9, 99, 99, 5, 4},
                {99, 99, 3, 99, 99, 5, 99, 11},
                {99, 99, 99, 99, 2, 4, 11, 99}
        };

        List<Edges> minSpanTree = prims(costMatrix);

        
        for (Edges edge : minSpanTree) {
            System.out.println(edge);
        }
    }
}
