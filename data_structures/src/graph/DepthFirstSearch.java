package graph;

/**
 * Created by tylerfolkman on 8/5/15.
 */
public class DepthFirstSearch {

    private boolean[] marked;

    public DepthFirstSearch(GraphTF graphTF, int s){
        marked = new boolean[graphTF.size()];
        GraphNode root = graphTF.graphNodes[s];
        dfs(graphTF, root);
    }

    private void dfs(GraphTF graphTF, GraphNode v){
        System.out.println(v.name);
        marked[v.name] = true;
        if (v.children != null) {
            for (GraphNode w : v.children) {
                if (!marked[w.name]) {
                    dfs(graphTF, w);
                }
            }
        }
    }

}
