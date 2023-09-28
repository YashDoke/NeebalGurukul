package graphPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DfsRecurssion {
	
	static void dfs(int[][] adjMatrix, boolean visited[], int s) {
		visited[s] = true;
		System.out.print((char) (s + 65));

		for (int j = 0; j < adjMatrix.length; j++) {
			if (adjMatrix[s][j] == 1 && !visited[j]) {
				dfs(adjMatrix, visited, j);
			}
		}
	}

	static void dfs2(int[][] adjMatrix, boolean visited[], int s) {
		Stack<Integer> stack = new Stack<>();
		stack.push(s);
		visited[s]=true;
		System.out.print((char) (s + 65) + " ");
		while (!stack.isEmpty()) {
			int n = stack.peek();
			boolean flag = true;
			for (int j = 0; j < adjMatrix.length; j++) {
				if (adjMatrix[n][j] == 1 && !visited[j]) {
					stack.push(j);
					visited[j] = true;
					System.out.print((char) (j + 65) + " ");
					flag = false;
					break;
				}
				
			}if (flag) {
				stack.pop();
			}
			
		}

	}

	public static void bfs(int[][] adjMatrix, int s) {
		int n = adjMatrix.length;
		boolean[] visited = new boolean[n];
//		Queue<Integer> queue = new LinkedList<>();
		ArrayList<Integer> queue = new ArrayList<>();
		

		visited[s] = true;
//		queue.offer(s);
		queue.add(s);

		while (!queue.isEmpty()) {
//			int m = queue.poll();
			int m = queue.get(0);
			queue.remove(0);
//            System.out.print(m + " ");
			System.out.print((char) (m + 65));

			for (int j = 0; j < n; j++) {
				if (adjMatrix[m][j] == 1 && !visited[j]) {
					visited[j] = true;
//					queue.offer(j);
					queue.add(j);
				}
			}
		}
	}

	public static void main(String[] args) {
		int s = 0;
		boolean visited[] = new boolean[7];

		int adjMatrix[][] = { { 0, 1, 1, 0, 0, 0, 0 }, 
								{ 1, 0, 0, 1, 0, 0, 0 }, 
								{ 1, 0, 0, 0, 1, 0, 1 },
								{ 0, 1, 0, 0, 0, 1, 1 }, 
								{ 0, 0, 1, 0, 0, 1, 1 }, 
								{ 0, 0, 0, 1, 1, 0, 1 }, 
								{ 0, 0, 1, 1, 1, 1, 0 } };
//	System.out.print("DFS using Recurssion: ");
//	dfs(adjMatrix,visited,s);

//		System.out.println();
//		System.out.print("DFS with Stack: ");
//		dfs2(adjMatrix, visited, s);

	System.out.println();
	System.out.print("BFS: ");
	bfs(adjMatrix,s);

	}
}
