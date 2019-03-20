package com.Demo4BinaryTree;

/**
 * @author action.zhou
 * @version v1.0
 * @date Created in 2019/3/20
 * @description
 */
public class TreeNode<T> {
    T data;
    TreeNode<T> left;
    TreeNode<T> right;

    public TreeNode(){
        this.data = null;

    }

    public TreeNode(T data) {
        this.data = data;

    }
}
