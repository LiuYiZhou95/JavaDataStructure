package com.Demo7ThreadedBinaryTree;
/**
 * @author action.zhou
 * @version v1.0
 * @date Created in 2019/3/21
 * @description
 */
public class ThreadTreeTest {

    public static void main(String[] args) {
        String[] data = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        System.out.println("普通中序遍历");
        ThreadTree<String> threadTree = new ThreadTree<String>(data);      // 创建普通二叉树
        threadTree.inorderTraversal(threadTree.getRoot());           // 中序递归遍历二叉树
        System.out.println("\n线索中序遍历");

        threadTree.inThread(threadTree.getRoot());         // 采用中序遍历将二叉树线索化
        threadTree.inThreadList(threadTree.getRoot());     // 中序遍历线索化二叉树
    }
}
