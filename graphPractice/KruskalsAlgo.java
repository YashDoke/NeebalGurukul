package graphPractice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import graphPractice.MinimumSpanningTree;



public class KruskalsAlgo {
	static List<Edges> kruskals(int costMatrix[][]){
		
//		 PriorityQueue<Edges> pq = new PriorityQueue<>();
		List<Edges> pq = new ArrayList<Edges>();
		 boolean[] visited = new boolean[costMatrix.length];

		 for (int i = 0; i < costMatrix.length; i++) {
	            for (int j = i + 1; j < costMatrix.length; j++) {
	                if (costMatrix[i][j] != 99) {
	                    pq.add(new Edges(i, j, costMatrix[i][j]));
	                }
	            }
	        }
		 Collections.sort(pq,Comparator.comparingInt(e->e.getWeight()));
		 
	    List<Edges> list = new ArrayList<Edges>();
	    int edge = 0;
	    
	    while(edge<costMatrix.length-1&& !pq.isEmpty()) {
	    	Edges e = pq.get(0);
	    	pq.remove(0);
	    	int i = e.getNode1();
	    	int j = e.getNode2();
	    	
	    	if(!visited[i]||!visited[j]) {
	    		visited[i] = true;
	    		visited[j] = true;
	    		list.add(e);
	    		edge++;
	    	}
	    }
	    return list;
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

     List<Edges> minSpanTree = kruskals(costMatrix);

    
     for (Edges edge : minSpanTree) {
         System.out.println(edge);
     }
}
}
