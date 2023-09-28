package graphAssignment;
import java.util.ArrayList;
import java.util.List;

public class SmallestSetOfVertices {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> result = new ArrayList<>();
        int[] inDegrees = new int[n];

      
        for (List<Integer> edge : edges) {
            int toNode = edge.get(1);
            inDegrees[toNode]++;
        }

       
        for (int i = 0; i < n; i++) {
            if (inDegrees[i] == 0) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        SmallestSetOfVertices solution = new SmallestSetOfVertices();

       
        int n1 = 6;
        List<List<Integer>> edges1 = List.of(
            List.of(0, 1),
            List.of(0, 2),
            List.of(2, 5),
            List.of(3, 4),
            List.of(4, 2)
        );
        List<Integer> result1 = solution.findSmallestSetOfVertices(n1, edges1);
        System.out.println(result1);
        
        int n2 = 5;
        List<List<Integer>> edges2 = List.of(
            List.of(0, 1),
            List.of(2, 1),
            List.of(3, 1),
            List.of(1, 4),
            List.of(2, 4)
        );
        List<Integer> result2 = solution.findSmallestSetOfVertices(n2, edges2);
        System.out.println(result2); 
    }
}
