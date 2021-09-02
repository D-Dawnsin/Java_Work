/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

import bridges.base.BinTreeElement;
import bridges.connect.Bridges;
import bridges.validation.RateLimitException;
import java.io.IOException;


public class BinarySearchTree {
    
    private Node root;
    private BinTreeElement<String> vRoot;
    
     public void visualize(Bridges b) throws IOException, RateLimitException
    {
        b.setDataStructure(vRoot);
        b.visualize();
    }
    
    public BinarySearchTree(String s)
    {
        root = new Node(s);
        vRoot = new BinTreeElement(s);
    }
   
    
    private class Node
    {
        String data;
        Node left;
        Node right;
        
        Node(String o)
        {
            data = o;
        }
    }
    
    public void Insert(String s)
    {
        insertInOrder(root , vRoot , s);
    }
    
    
    private void insertInOrder(Node n , BinTreeElement<String> vNode , String s) // this is private because it deals with nodes and the user doesn't know what a node is (because user doesn't have access to the root)
    {
        Node newNode = new Node(s);
        BinTreeElement<String> newVNode = new BinTreeElement(s , s);
        
        if(root == null)
        {
            root = newNode;
            vRoot = newVNode;
        }
            
        
        else
        {
            int x = s.compareTo(n.data);
            if (x < 0)
            {
                if(n.left == null)
                {
                    n.left = newNode;
                    vNode.setLeft(newVNode);
                }
                else
                    insertInOrder(n.left , vNode.getLeft() , s);
            }
            
            else
            {
                if(n.right == null)
                {
                    n.right = newNode;
                    vNode.setRight(newVNode);
                }
                
                else
                    insertInOrder(n.right , vNode.getRight() , s);
            }
                
        }
    }
    
    public void traverse()
    {
        traverseInOrder(root);
    }
    
    public void traversePre()
    {
        traversePreOrder(root);
    }
    
    public void traversePost()
    {
        traversePostOrder(root);
    }
    
    private void traverseInOrder(Node n)
    {
        if(n.left != null)
            traverseInOrder(n.left);
        
        System.out.println(n.data);
        
        if(n.right != null)
            traverseInOrder(n.right);
    }
    
    private void traversePreOrder(Node n)
    {
        System.out.println(n.data);
        
        if (n.left != null)
            traversePreOrder(n.left);
        
        if (n.right != null)
            traversePreOrder(n.right);
    }
    
    private void traversePostOrder(Node n)
    {
        if (n.left != null)
            traversePostOrder(n.left);
        
        if (n.right != null)
            traversePostOrder(n.right);
        
        System.out.println(n.data);
    }
    
}
