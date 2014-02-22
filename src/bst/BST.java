/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

import classes.BinarySearchTree;

/**
 *
 * @author HP
 */
public class BST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinarySearchTree tree = new BinarySearchTree();
        
        tree.insert("AAA","asdf","qwer", 111);
        tree.insert("BBB","asdf","qwer", 111);
        tree.insert("CCC","asdf","qwer", 111);
        tree.insert("DDD","asdf","qwer", 111);
        tree.insert("ABB","asdf","qwer", 111);
        tree.insert("ABC","asdf","qwer", 111);
        
        tree.print();
    }
}
