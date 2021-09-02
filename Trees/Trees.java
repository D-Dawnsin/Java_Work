/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

import bridges.connect.Bridges;
import bridges.validation.RateLimitException;
import java.io.IOException;


public class Trees {
    
    
    
    
    public static void main(String[] args) throws IOException, RateLimitException {
    
        Bridges bridges = new Bridges(0, "DDemien", "769929726938");
        
        BinarySearchTree tree = new BinarySearchTree("Fred");
        tree.Insert("Boy");
        tree.Insert("Girl");
        tree.Insert("Cat");
        tree.Insert("Dog");
        tree.Insert("Turtle");
        tree.Insert("Ape");
        tree.Insert("Sky");
        tree.Insert("Box");
        tree.Insert("Spongebob");
        tree.Insert("Gumball");
        
        tree.traverse();
        System.out.println("");
        tree.traversePre();
        System.out.println("");
        tree.traversePost();
        
        tree.visualize(bridges);
        
        
    }
    
}
