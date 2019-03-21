package com.Demo7ThreadedBinaryTree;
/**
 * @author action.zhou
 * @version v1.0
 * @date Created in 2019/3/21
 * @description
 */
public class ThreadTree<T> {
    TreeNode<T> root;
    int size;
    TreeNode<T> pre = null;

    public ThreadTree() {
        this.root = null;
        this.size = 0;
        this.pre = null;
    }

    public ThreadTree(T[] data) {
        this.pre = null;
        this.size = data.length;
        this.root = createTree(data, 1);   // 创建二叉树
    }
    /**
     * 创建二叉树
     * */
    public TreeNode<T> createTree( T[]data,int index){
        if (index>data.length)
            return null;
        TreeNode<T> node=new TreeNode<T>(data[index-1]);
        TreeNode<T> left=createTree(data,2*index);
        TreeNode<T> right=createTree(data,2*index+1);
        node.setLeft(left);
        node.setRight(right);
        return node;
    }

    /**
     * 将以root为根节点的二叉树线索化
     * */
    public void inThread(TreeNode<T> root){
        if (root!=null){
            inThread(root.left);
            if (root.getLeft()==null){
                root.setLeftIsThreaded(true);
                root.setLeft(pre);
            }
            if (pre!=null&&pre.getRight()==null){
                pre.setRightIsThreaded(true);
                pre.setRight(root);
            }
            pre=root;
            inThread(root.getRight());
        }
    }
    /**
     * 中序遍历root查询item
     *
     * @param root
     * @return
     */
    public void inorderTraversal(TreeNode<T> root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);

        System.out.print(root.getData() + "->");


        inorderTraversal(root.right);
    }
    /**
     * 中序遍历线索二叉树
     *
     */
    public void inThreadList(TreeNode<T> root)
    {
        if (root != null)
        {
            while (root != null && !root.isLeftIsThreaded())    // 如果左孩子不是线索
            {
                root = root.getLeft();
            }

            do
            {
                System.out.print(root.getData() + "->");
                if (root.isRightIsThreaded())   // 如果右孩子是线索
                {
                    root = root.getRight();
                }
                else         // 有右孩子
                {
                    root = root.getRight();
                    while (root != null && !root.isLeftIsThreaded())
                    {
                        root = root.getLeft();
                    }
                }
            } while (root != null);
        }
    }


    public int getSize() {
        return size;
    }

    public TreeNode<T> getRoot() {
        return root;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setRoot(TreeNode<T> root) {
        this.root = root;
    }
}
