package treesandgraphs;

/**
 * Created by tylerfolkman on 8/7/15.
 */
public class q2 {

    private class TreeNode{
        public TreeNode left;
        public TreeNode right;
        public int value;
        public TreeNode(int v){
            this.value = v;
        }
    }

    public TreeNode createMinBST(int array[]){
        return createMinBST(array, 0, array.length - 1);
    }

    private TreeNode createMinBST(int[] arr, int start, int end){
        if (end < start) return null;
        int mid = (start + end ) / 2;
        TreeNode n = new TreeNode(arr[mid]);
        n.left = createMinBST(arr, start, mid - 1);
        n.right = createMinBST(arr, mid + 1, end);
        return n;
    }

    public static void main (String[] args){

        int [] arr = {1,2,3,4,5,6,7};
        q2 q2 = new q2();
        TreeNode treeNode = q2.createMinBST(arr);
        System.out.println(treeNode.value);


    }

}
