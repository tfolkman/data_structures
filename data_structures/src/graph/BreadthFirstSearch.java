package graph;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by tylerfolkman on 8/7/15.
 */
public class BreadthFirstSearch {

    LinkedList<GraphNode> linkedList = new LinkedList<>();
    ArrayList<GraphNode> arrayList = new ArrayList<>();

    public BreadthFirstSearch(GraphTF graphTF, int root){
        GraphNode rootNode = graphTF.graphNodes[root];
        linkedList.addLast(rootNode);
        while (!linkedList.isEmpty()){
            GraphNode current = linkedList.removeFirst();
            System.out.println(current.name);
            if (current.children == null) continue;
            for (GraphNode node : current.children){
                if (!arrayList.contains(node)) {
                    linkedList.addLast(node);
                    arrayList.add(node);
                }
            }
        }
    }
}
