package dsa.tree;

public class TreeProblems {

    public static void main(String[] args) {

    }

    //return maximum height/depth of a tree
    public static int maxDepth(TreeNode root)
    {
        if(root==null)
            return 0;
        int left= maxDepth(root.left);
        int right= maxDepth(root.right);
        if(left>right)
            return 1+left;
        else
            return 1+right;

    }

}

