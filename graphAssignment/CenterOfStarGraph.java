package graphAssignment;

public class CenterOfStarGraph {
public static void main(String[] args) {
//	int edges [][]= {{1,2},{2,3},{4,2}};
	int edges [][] = {{1,2},
						{5,1},
						{1,3},
						{1,4}};
	
	int center = edges[0][0]==edges[1][0]||edges[0][0]==edges[1][1]?edges[0][0]:edges[0][1];
	
	System.out.println("Center of the Graph: "+center);
}
}
