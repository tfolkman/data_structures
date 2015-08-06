package binarytree;

/**
 * Created by tylerfolkman on 8/4/15.
 */
public class BinaryTreeTraversal {

    // visits nodes in ascending order -> 1,2,3,4...
    public void inOrder(BinaryNodeTF root){
        if (root != null){
            inOrder(root.left);
            System.out.println(root.name);
            inOrder(root.right);
        }
    }

    // visits parents before children
    public void preOrder(BinaryNodeTF root){
        if (root != null){
            System.out.println(root.name);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    // visits children before parents
    public void postOrder(BinaryNodeTF root){
        if (root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.name);
        }
    }
}
