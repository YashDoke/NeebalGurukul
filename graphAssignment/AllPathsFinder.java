package graphAssignment;
import java.util.ArrayList;
import java.util.List;

public class AllPathsFinder{
   static  public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        
      
        dfs(graph, 0, path, result);
        
        return result;
    }
    
    private static void dfs(int[][] graph, int node, List<Integer> path, List<List<Integer>> result) {
        path.add(node);
        
        if (node == graph.length - 1) {
        
            result.add(new ArrayList<>(path));
        } else {
            for (int neighbor : graph[node]) {
         
                dfs(graph, neighbor, path, result);
            }
        }
        
        
        path.remove(path.size() - 1);
    }
    
    public static void main(String[] args) {
        int[][] graph1 = {{1, 2}, {3}, {3}, {}};
       
        List<List<Integer>> paths1 = allPathsSourceTarget(graph1);
        System.out.println(paths1);
        
        int[][] graph2 = {{4, 3, 1}, {3, 2, 4}, {3}, {4}, {}};
        List<List<Integer>> paths2 =allPathsSourceTarget(graph2);
        System.out.println(paths2);
    }
}
