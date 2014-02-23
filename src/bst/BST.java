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
        tree.insert("ABC","asdf","qwer", 111);
        tree.insert("ABB","asdf","qwer", 111);
        tree.insert("BBB","asdf","qwer", 112);
        tree.insert("CCC","asdf","qwer", 113);
        tree.insert("DDD","asdf","qwer", 114);
        tree.insert("C BB","asdf","qwer", 115);
        tree.insert("C ABC","asdf","qwer", 116);
        tree.insert("D ABC","asdf","qwer", 117);
        tree.insert("D BBC","asdf","qwer", 118);
        tree.insert("F ABC","asdf","qwer", 119);
        
        tree.print();
        
        System.out.println("search");
        tree.searchByTitle("C BB");
        
        tree.searchByKeyword("A");
        
//        System.out.println("delete");
//        tree.deleteByTitle("ABB");
////        
//        System.out.println("after delete");
//        tree.print();
    }
}
