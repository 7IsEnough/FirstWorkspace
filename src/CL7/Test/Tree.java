package CL7.Test;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Promise
 * @create 2019-10-05-19:50
 */
public class Tree {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        TreeNode pRoot = new TreeNode(5);
        pRoot.left = new TreeNode(3);
        pRoot.right = new TreeNode(7);
        pRoot.left.left = new TreeNode(2);
        pRoot.left.right = new TreeNode(4);
        pRoot.right.left = new TreeNode(6);
        pRoot.right.right = new TreeNode(8);
        new Tree().PreOrder(pRoot,list);
        System.out.println(list);
        list.clear();
        new Tree().InOrder(pRoot,list);
        System.out.println(list);
        list.clear();
        new Tree().BackOrder(pRoot,list);
        System.out.println(list);
        list.clear();
        new Tree().LaywerOrder(pRoot,list);
        System.out.println(list);
        list.clear();
        new Tree().PreOrder2(pRoot,list);
        System.out.println(list);
        list.clear();
        new Tree().InOrder2(pRoot,list);
        System.out.println(list);
        list.clear();
        new Tree().BackOrder2(pRoot,list);
        System.out.println(list);
        list.clear();
    }

    //前序遍历递归
    public void PreOrder(TreeNode root,ArrayList<Integer> list){
        list.add(root.val);
        if(root.left!=null){
            PreOrder(root.left,list);
        }
        if(root.right!=null){
            PreOrder(root.right,list);
        }
    }

    //中序遍历递归
    public void InOrder(TreeNode root,ArrayList<Integer> list){
        if(root.left!=null){
            InOrder(root.left,list);
        }
        list.add(root.val);
        if(root.right!=null){
            InOrder(root.right,list);
        }
    }

    //后序遍历递归
    public void BackOrder(TreeNode root,ArrayList<Integer> list){
        if(root.left!=null){
            BackOrder(root.left,list);
        }
        if(root.right!=null){
            BackOrder(root.right,list);
        }
        list.add(root.val);
    }

    //层序遍历迭代
    public void LaywerOrder(TreeNode root,ArrayList<Integer> list){
        LinkedList<TreeNode> list2 = new LinkedList<>();
        list2.add(root);
        list.add(root.val);
        while (!list2.isEmpty()){
            TreeNode t = list2.poll();
            if(t.left!=null){
                list2.add(t.left);
                list.add(t.left.val);
            }
            if(t.right!=null){
                list2.add(t.right);
                list.add(t.right.val);
            }
        }
    }

    //先序遍历(非递归)
    public void PreOrder2(TreeNode root,ArrayList<Integer> list){
        LinkedList<TreeNode> list2 = new LinkedList<>();
        TreeNode temp = root;
        while (!list2.isEmpty() || temp!=null){
            while (temp!=null){
                list2.push(temp);
                list.add(temp.val);
                temp = temp.left;
            }
            temp = list2.poll().right;
        }
    }

    //中序遍历(非递归)
    public void InOrder2(TreeNode root,ArrayList<Integer> list){
        LinkedList<TreeNode> list2 = new LinkedList<>();
        while (root!=null || !list2.isEmpty()){
            while (root!=null){
                list2.push(root);
                root = root.left;
            }
            TreeNode t = list2.poll();
            list.add(t.val);
            root = t.right;
        }
    }

    //后序遍历(非递归)
    public void BackOrder2(TreeNode root,ArrayList<Integer> list){
        LinkedList<TreeNode> list1 = new LinkedList<>();
        LinkedList<TreeNode> list2 = new LinkedList<>();
        list1.add(root);
        while (!list1.isEmpty()){
            TreeNode t = list1.poll();
            list2.push(t);
            if(t.left!=null){
                list1.push(t.left);
            }
            if(t.right!=null){
                list1.push(t.right);
            }
        }


        while (!list2.isEmpty()){
            list.add(list2.pop().val);
        }

    }
}
