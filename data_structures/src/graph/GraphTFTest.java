package graph;

/**
 * Created by tylerfolkman on 8/5/15.
 */
public class GraphTFTest {

    public static void main(String [] args){

        GraphNode zero = new GraphNode();
        GraphNode one = new GraphNode();
        GraphNode two = new GraphNode();
        GraphNode three = new GraphNode();

        zero.name = 0;
        one.name = 1;
        two.name = 2;
        three.name = 3;

        GraphNode [] zeroChildren = {one, two};
        GraphNode [] oneChildren = {three};

        zero.children = zeroChildren;
        one.children = oneChildren;

        GraphNode [] graphNodes = {zero, one, two, three};
        GraphTF graphTF = new GraphTF(graphNodes);


        DepthFirstSearch depthFirstSearch = new DepthFirstSearch(graphTF, 0);

    }

}
