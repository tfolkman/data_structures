package graph;

/**
 * Created by tylerfolkman on 8/5/15.
 */
public class GraphTF {

    public final GraphNode[] graphNodes;

    public GraphTF(GraphNode[] graphNodes){
        this.graphNodes = graphNodes;
    }

    public int size(){
        return graphNodes.length;
    }

}
