package graphPractice;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Stack;
public class GraphDemo {
	

	    public static ArrayList<Integer> topologicalSort(int[][] adjMatrix) {
	        int numVertices = adjMatrix.length;
	        boolean[] visited = new boolean[numVertices];
	        Stack<Integer> stack = new Stack<>();
	        ArrayList<Integer> result = new ArrayList<>();

	        
	        for (int i = 0; i < numVertices; i++) {
	            if (!visited[i]) {
	                dfs(i, adjMatrix, visited, stack);
	            }
	        }

 	        while (!stack.isEmpty()) {
	            result.add(stack.pop());
	        }

	        return result;
	    }

	    static void dfs(int vertex, int[][] adjMatrix, boolean[] visited, Stack<Integer> stack) {
	        visited[vertex] = true;

	        for (int i = 0; i < adjMatrix.length; i++) {
	            if (adjMatrix[vertex][i] == 1 && !visited[i]) {
	                dfs(i, adjMatrix, visited, stack);
	            }
	        }

	        stack.push(vertex);
	    }

	     
 
public static void main(String[] args) {
	
	int adjMatrix[][] = {{0,1,1,0,0,0},
						 {0,0,1,0,0,0},
						 {0,0,0,1,0,0},
						 {0,0,0,0,0,0},
						 {0,0,1,1,0,1},
						 {1,1,1,1,0,0}
						 };
	ArrayList<Integer> result = topologicalSort(adjMatrix);

    System.out.println("Topological Sort Order:");
    for (Integer vertex : result) {
        System.out.print((char)(vertex + 65));
    }

//	for(int i=0;i<adjMatrix.length;i++) {
//		for(int j=0;j<adjMatrix.length;j++) {
//			boolean  flag = true;
//			for(int k=0;k<adjMatrix.length;k++) {
//				if(adjMatrix[j][k]==1) {
//					flag=false;
//					break;
//				}
//			}
//			if(flag) {
//				Arrays.fill(adjMatrix[],0);
//			}
//		}
//	}
//	
//	for(int i=0;i<adjMatrix.length;i++) {
//		for(int j=0;j<adjMatrix.length;j++) {
//			System.out.print(adjMatrix[i][j]);
//		}
//		System.out.println();
//	}
	
}
}
