package com.Demo8HuffmanTree;

import android.content.Context;

import java.util.Scanner;

public class HaffmanTest {

    //主函数
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        int m;
        System.out.print("请输入字符个数：");
        n = input.nextInt();
        m=2*n-1;
        HaffmanTreeNode[] huffmanTree = new HaffmanTreeNode[m];
        HaffmanTreeCode[] huffmanCode = new HaffmanTreeCode[n];
        ConStructureHaffmanTree conStructureHaffmanTree=new ConStructureHaffmanTree();

        //初始化huffmanTree,huffmanCode
        conStructureHaffmanTree.initHuffmanTree(huffmanTree,m);
        conStructureHaffmanTree.initHuffmanCode(huffmanCode,n);

        //获取huffmanCode的符号
        System.out.print("请输入哈夫曼编码的字符：");
        conStructureHaffmanTree.getHuffmanCode(huffmanCode,n);

        //获取huffmanTree的频数
        System.out.print("请输入哈夫曼编码字符对应的频数：");
        conStructureHaffmanTree.getHuffmanWeight(huffmanTree,n);

        //创建huffmanTree
        conStructureHaffmanTree.createHaffmanTree(huffmanTree,n);
        //创建huffmanCode
        conStructureHaffmanTree.createHaffmanCode(huffmanTree,huffmanCode,n);

        //输出huffmanCode编码
        conStructureHaffmanTree.ouputHaffmanCode(huffmanCode,n);

    }
}
