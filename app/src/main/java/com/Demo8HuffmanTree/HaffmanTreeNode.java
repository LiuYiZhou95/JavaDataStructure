/**
 --  * File name:    HaffmanTree
 --  * Author:       action.zhou
 --  * Version:      1.0
 --  * Date:         2019.3.26
 --  * Description:  霍夫曼树节点类
 --  * Others:
 --  * Function List:
 --  * History:
 --  */
package com.Demo8HuffmanTree;

public class HaffmanTreeNode {
    int weight;
    int parent;
    int leftchild;
    int rightchild;

    public HaffmanTreeNode(int weight,int parent,int leftchild,int rightchild){
        this.weight=weight;
        this.parent=parent;
        this.leftchild=leftchild;
        this.rightchild=rightchild;
    }

    public void setLeftchild(int leftchild) {
        this.leftchild = leftchild;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }

    public void setRightchild(int rightchild) {
        this.rightchild = rightchild;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLeftchild() {
        return leftchild;
    }

    public int getParent() {
        return parent;
    }

    public int getRightchild() {
        return rightchild;
    }

    public int getWeight() {
        return weight;
    }
}
