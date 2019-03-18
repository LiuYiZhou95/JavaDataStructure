package com.java.Tree;


/**
 * 树的遍历
 * @author Administrator
 *
 */
public class Order {
    /**
     * 先根遍历
     * @param root 要的根结点
     */
    public void preOrder(Tree root) {
        if(!root.isEmpty()) {
            visit(root);
            for(Tree child : root.getChilds()) {
                if(child != null) {
                    preOrder(child);
                }
            }
        }
    }
    /**
     * 后根遍历
     * @param root 树的根结点
     */
    public void postOrder(Tree root) {
        if(!root.isEmpty()) {
            for(Tree child : root.getChilds()) {
                if(child != null) {
                    preOrder(child);
                }
            }
            visit(root);
        }
    }

    public void visit(Tree tree) {
        System.out.print("\t" + tree.getRootData());
    }

}