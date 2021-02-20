package CL7.Test;

/**
 * @author Promise
 * @create 2019-08-26-16:58
 */
public class Solution {
    int index = 0;
    public static void main(String[] args) {
        TreeNode pRoot = new TreeNode(5);
        pRoot.left = new TreeNode(3);
        pRoot.right = new TreeNode(7);
        pRoot.left.left = new TreeNode(2);
        pRoot.left.right = new TreeNode(4);
        pRoot.right.left = new TreeNode(6);
        pRoot.right.right = new TreeNode(8);
        new Solution().Convert(null);

    }
    public TreeNode Convert(TreeNode pRootOfTree) {
        TreeNode last = vis(pRootOfTree, null);
        while (last != null && last.left != null) {
            last = last.left;
        }
        return last;
    }
    TreeNode pre = new TreeNode(Integer.MAX_VALUE);
    public TreeNode vis(TreeNode root, TreeNode last) {
        if (root == null) return null;
        //TreeNode cur = root;
        if (root.left != null) last = vis(root.left, last);
        System.out.println(root.val);
        root.left = last;
        if (last != null) {
            last.right = root;
        }
        last = root;
        if (root.right != null) last = vis(root.right, last);
        return last;
    }

}

