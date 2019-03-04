package com.lzt.utils;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by lzt on 2018/7/17.
 */
public class BinaryTreeUtils {
    //用来表示树的根节点
    Node root;
    //用来存储树的高度
    private int deep;
    private Scanner scanner;

    /**
     * 初始化树
     */
    public void init(){
        root = new Node();
        deep = 0;
    }

    /**
     * 获得树的高度
     * @return
     */
    public int getDeep() {
        deep = depth(root);
        return deep;
    }

    /**
     * 通过递归方法先序 创建二叉树
     * @param node
     */
    public void creatTree(Node node){
        scanner = new Scanner(System.in);
        System.out.println("请输入节点的值： ");
        String value = scanner.next();
        scanner.nextLine();
        if(value.equals("#")){
            node = null;
        }else {
            node.item = value;
            node.left = new Node();
            node.right = new Node();
            creatTree(node.left);
            creatTree(node.right);
        }
    }

    /**
     * 递归 先序遍历二叉树
     * @param node
     */
    public void preShow(Node node){
        if(node != null && node.item != null){
            System.out.print(node.item + "  ");
            preShow(node.left);
            preShow(node.right);
        }
    }

    /**
     * 递归 中序遍历二叉树
     * @param node
     */
    public void inorderShow(Node node){
        if(node != null && node.item != null){
            inorderShow(node.left);
            System.out.print(node.item + "  ");
            inorderShow(node.right);
        }
    }

    /**
     * 递归 后序遍历二叉树
     * @param node
     */
    public void posShow(Node node){
        if(node != null && node.item != null){
            posShow(node.left);
            posShow(node.right);
            System.out.print(node.item + "  ");
        }
    }

    /**
     * 非递归先序遍历二叉树
     */
    public void preShow(){
        Stack<Node> stack = new Stack<>();
        Node node = root;
        while((node.item != null && node != null) || stack.empty() != true){
            if(node.item != null && node != null){
                System.out.print(node.item + "  ");
                stack.push(node);
                node = node.left;
            }else{
                node = stack.pop();
                node = node.right;
            }
        }
        System.out.println();
    }

    /**
     * 非递归中序遍历二叉树
     */
    public void inorderShow(){
        Stack<Node> stack = new Stack<>();
        Node node = root;
        while(true){
            while(node != null && node.item != null){
                stack.push(node);
                node = node.left;
            }
            if(stack.empty() == true){
                System.out.println();
                return;
            }
            node = stack.pop();
            System.out.print(node.item + "  ");
            node = node.right;
        }
    }

    /**
     * 非递归后序遍历二叉树
     */
    public void posShow(){
        Stack<Node> stack = new Stack<>();
        Node node = root;
        while(true){
            while(node != null && node.item != null){
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            while(node.isVisited == true){
                System.out.print(node.item + "  ");
                if(stack.empty() == true){
                    System.out.println();
                    return;
                }
                node = stack.pop();
            }
            if(node.isVisited == false){
                node.isVisited = true;
                stack.push(node);
                node = node.right;
            }
        }
    }

    /**
     * 求树的深度
     * @param node
     * @return
     */
    private int depth(Node node){
        int deepl = 0;
        int deepr = 0;
        if(node == null || node.item == null){
            return 0;
        }
        deepl = depth(node.left);
        deepr = depth(node.right);
        return 1+(deepl > deepr ? deepl : deepr);
    }

    /**
     * 内部类构建树的节点
     * @author dell
     *
     */
    static class Node{
        String item;
        Node left;
        Node right;
        boolean isVisited = false;

        Node(){}
        Node(String element, Node left, Node right){
            this.item = element;
            this.left = left;
            this.right = right;
        }
    }


}
