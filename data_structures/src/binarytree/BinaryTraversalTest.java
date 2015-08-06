package binarytree;

/**
 * Created by tylerfolkman on 8/4/15.
 */
public class BinaryTraversalTest {

    public static void main(String [] args){

        BinaryNodeTF root = new BinaryNodeTF();
        BinaryNodeTF level1_left = new BinaryNodeTF();
        BinaryNodeTF level1_right = new BinaryNodeTF();
        BinaryNodeTF level2_left_left = new BinaryNodeTF();
        BinaryNodeTF level2_left_right = new BinaryNodeTF();
        BinaryNodeTF level2_right_right = new BinaryNodeTF();

        root.left = level1_left;
        root.right = level1_right;
        level1_left.left = level2_left_left;
        level1_left.right = level2_left_right;
        level1_right.right = level2_right_right;

        root.name = "8";
        level1_left.name = "4";
        level1_right.name = "10";
        level2_left_left.name = "2";
        level2_left_right.name = "6";
        level2_right_right.name = "20";

        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversal();

        binaryTreeTraversal.inOrder(root);
        System.out.println("***************");
        binaryTreeTraversal.preOrder(root);
        System.out.println("***************");
        binaryTreeTraversal.postOrder(root);

    }


}
