package com.Demo7ThreadedBinaryTree;

/**
 * @author action.zhou
 * @version v1.0
 * @date Created in 2019/3/21
 * @description
 */
public class TreeNode<T> {
    T data;
    TreeNode<T> left;
    TreeNode<T> right;
    boolean leftIsThreaded; //左孩子是否为线索
    boolean rightIsThreaded; //右孩子是否为线索

    public TreeNode(T data){
        this.data=data;
        this.left=null;
        this.right=null;
        this.leftIsThreaded=false;
        this.rightIsThreaded=false;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }

    public boolean isLeftIsThreaded() {
        return leftIsThreaded;
    }

    public boolean isRightIsThreaded() {
        return rightIsThreaded;
    }

    public void setLeftIsThreaded(boolean leftIsThreaded) {
        this.leftIsThreaded = leftIsThreaded;
    }

    public void setRightIsThreaded(boolean rightIsThreaded) {
        this.rightIsThreaded = rightIsThreaded;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public TreeNode<T> getRight() {
        return right;
    }

}
