package graphPractice;

import java.util.Arrays;

public class GraphDemo2 {
	static boolean check(boolean visited[]) {
		for(int i=0;i<visited.length;i++) {
			if(visited[i]==false) {
				return false;
			}
		}
		return true;
	}
	
public static void main(String[] args) {
	int adjMatrix[][] = {{0,1,1,0,0,0},
						 {0,0,1,0,0,0},
						 {0,0,0,1,0,0},
						 {0,0,0,0,0,0},
						 {0,0,1,1,0,1},
						 {1,1,1,1,0,0}
						 };
	boolean [] visited = new boolean[6];
	boolean cancle = false;
	int i=0;
	while(true) {
		boolean flag = true;
		for(int j=0;j<adjMatrix.length;j++) {
			if(adjMatrix[j][i]==1) {
				flag = false;
				break;
			}
		}
		if(flag) {
			visited[i]=true;
			System.out.println((char)(i+65));
			for(int j=0;j<adjMatrix.length;j++) {
				adjMatrix[i][j]=0;
				
			}
			cancle=true;
		}
		i=(i+1)%adjMatrix.length;
		
		if(check(visited)) {
			break;
		}
		if(i==0) {
			if(cancle==false) {
				System.out.println("IT Cyclic Graph");
			}else {
				cancle=true;
			}
		}
	}
	

		
		
}
}
