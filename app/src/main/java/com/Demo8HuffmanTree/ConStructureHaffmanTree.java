package com.Demo8HuffmanTree;

/**
 --  * File name:    HaffmanTree
 --  * Author:       action.zhou
 --  * Version:      1.0
 --  * Date:         2019.3.26
 --  * Description:  收集霍夫曼树的构建条件，构建霍夫曼树
 --  * Others:       一个有n个叶子节点的的霍夫曼树有2*、n-1个节点
 --  * Function List:
 --  * History:
 --  */

import java.util.Scanner;

public class ConStructureHaffmanTree {

    public ConStructureHaffmanTree(){

    }

    //初始化一个huffuman树
    public static void initHuffmanTree(HaffmanTreeNode[] huffmanTree,int m){
        for(int i=0;i<m;i++){
            huffmanTree[i] = new HaffmanTreeNode(0,-1,-1,-1);
        }
    }

    //初始化一个huffmanCode
    public static void initHuffmanCode(HaffmanTreeCode[] huffmanCode,int n){
        for(int i=0;i<n;i++){
            huffmanCode[i]=new HaffmanTreeCode("","");
        }
    }

    //获取huffmanCode的符号
    public static void getHuffmanCode(HaffmanTreeCode[] huffmanCode , int n){
        Scanner input = new Scanner(System.in);
        for(int i=0;i<n;i++){
            String temp = input.next();
            huffmanCode[i] = new HaffmanTreeCode(temp,"");
        }
    }

    //获取huffman树节点频数
    public static void getHuffmanWeight(HaffmanTreeNode[] huffmanTree , int n) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            int temp = input.nextInt();
            huffmanTree[i] = new HaffmanTreeNode(temp, -1, -1, -1);
        }
    }

    //从n个结点中选取最小的两个结点
    public static int[] selectMin(HaffmanTreeNode[] huffmanTree ,int n)
    {
        int min[] = new int[2];
        class TempNode
        {
            int newWeight;//存储权
            int place;//存储该结点所在的位置

            TempNode(int newWeight,int place){
                this.newWeight=newWeight;
                this.place=place;
            }

            void setNewWeight(int newWeight){
                this.newWeight=newWeight;
            }

            void setPlace(int place){
                this.place=place;
            }

            int getNewWeight(){
                return newWeight;
            }

            int getPlace(){
                return place;
            }
        }

        TempNode[] tempTree=new TempNode[n];

        //将huffmanTree中没有双亲的结点存储到tempTree中
        int i=0,j=0;
        for(i=0;i<n;i++)
        {
            if(huffmanTree[i].getParent()==-1&& huffmanTree[i].getWeight()!=0)
            {
                tempTree[j]= new TempNode(huffmanTree[i].getWeight(),i);
                j++;
            }
        }

        int m1,m2;
        m1=m2=0;
        for(i=0;i<j;i++)
        {
            if(tempTree[i].getNewWeight()<tempTree[m1].getNewWeight())//此处不让取到相等，是因为结点中有相同权值的时候，m1取最前的
                m1=i;
        }
        for(i=0;i<j;i++)
        {
            if(m1==m2)
                m2++;//当m1在第一个位置的时候，m2向后移一位
            if(tempTree[i].getNewWeight()<=tempTree[m2].getNewWeight()&& i!=m1)//此处取到相等，是让在结点中有相同的权值的时候，

                //m2取最后的那个。
                m2=i;
        }

        min[0]=tempTree[m1].getPlace();
        min[1]=tempTree[m2].getPlace();
        return min;
    }

    public static void createHaffmanTree(HaffmanTreeNode []huffmanTree,int n){
        if (n<=1)
            System.out.println("参数错误");

        int m =2*n-1;
        for (int i=n;i<m;i++){
            int []min=selectMin(huffmanTree,i);
            int min1=min[0];
            int min2=min[1];
            huffmanTree[min1].setParent(i);
            huffmanTree[min2].setParent(i);
            huffmanTree[i].setLeftchild(min1);
            huffmanTree[i].setRightchild(min2);
            huffmanTree[i].setWeight(huffmanTree[min1].getWeight()+ huffmanTree[min2].getWeight());

        }
    }

    //创建huffmanCode
    public static void createHaffmanCode(HaffmanTreeNode[] huffmanTree,HaffmanTreeCode[] huffmanCode,int n){
        Scanner input = new Scanner(System.in);
        char[] code = new char[10];
        int start;
        int c;
        int parent;
        int temp;

        code[n-1]='0';
        for(int i=0;i<n;i++)
        {
            StringBuffer stringBuffer = new StringBuffer();
            start=n-1;
            c=i;
            while( (parent=huffmanTree[c].getParent()) >=0 )
            {
                start--;
                code[start]=((huffmanTree[parent].getLeftchild()==c)?'0':'1');
                c=parent;

            }
            for(;start<n-1;start++){
                stringBuffer.append(code[start]);
            }
            huffmanCode[i].setCode(stringBuffer.toString());
        }
    }

    //输出hufmanCode
    public static void ouputHaffmanCode(HaffmanTreeCode[] huffmanCode,int n){
        System.out.println("字符与编码的对应关系如下：");
        for(int i=0;i<n;i++){
            System.out.println(huffmanCode[i].getCharacter()+":"+huffmanCode[i].getCode());
        }
    }

}
