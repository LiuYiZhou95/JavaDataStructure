package com.Demo4BinaryTree;

/**
 * @author action.zhou
 * @version v1.0
 * @date Created in 2019/3/20
 * @description 测试类
 */

public class TreeSearchTest {
    private static TreeNode<Integer> root;


    public static void main(String args[]) {
        TreeNode<Integer> node1 = new TreeNode<Integer>(1);
        TreeNode<Integer> node2 = new TreeNode<Integer>(2);
        TreeNode<Integer> node3 = new TreeNode<Integer>(3);
        TreeNode<Integer> node4 = new TreeNode<Integer>(4);
        TreeNode<Integer> node5 = new TreeNode<Integer>(5);
        TreeNode<Integer> node6 = new TreeNode<Integer>(6);
        TreeNode<Integer> node7 = new TreeNode<Integer>(7);
        TreeNode<Integer> node8 = new TreeNode<Integer>(8);
        TreeNode<Integer> node9 = new TreeNode<Integer>(9);
        TreeNode<Integer> node10 = new TreeNode<Integer>(10);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        node3.left = node6;
        node3.right = node7;

        node4.left = node8;

        node7.right = node9;

        node9.left = node10;

        root = node1;
        TreeSearch<Integer> treeSearch = new TreeSearch<Integer>();

        /**@Param data
         * 找到特定节点的数据，目前没啥用
         */
        treeSearch.postorderTraversal(root, -1);
        System.out.println(treeSearch.searchPath.toString());
    }


}
