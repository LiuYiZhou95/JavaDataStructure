package com.Demo4BinaryTree;
/**
 * @author action.zhou
 * @version v1.0
 * @date Created in 2019/3/20
 * @description
 */
public class TreeSearch<T> {
    StringBuffer searchPath = new StringBuffer();


    /**
     * 前序遍历root查询item
     *
     * @return
     */
    public void preorderTraversal(TreeNode<T> root, T data) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);

        //记录遍历路径
        if (!searchPath.toString().equals("")) {
            searchPath.append("->");
        }
        searchPath.append(root.data);

        preorderTraversal(root.left, data);

        preorderTraversal(root.right, data);
    }

    /**
     * 中序遍历root查询item
     *
     * @param root
     * @return
     */
    public void inorderTraversal(TreeNode<T> root, T data) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left, data);


        if (!searchPath.toString().equals("")) {
            searchPath.append("->");
        }
        searchPath.append(root.data);

        inorderTraversal(root.right, data);
    }

    /**
     * 后续遍历root查询item
     *
     * @return
     */
    public void postorderTraversal(TreeNode<T> root, T data) {
        if (root == null) {
            return;
        }


        postorderTraversal(root.left, data);


        postorderTraversal(root.right, data);


        if (!searchPath.toString().equals("")) {
            searchPath.append("->");
        }
            searchPath.append(root.data);


    }


}

