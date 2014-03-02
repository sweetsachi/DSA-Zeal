/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

import classes.BinarySearchTree;
import classes.Node;
//import form.MainForm;

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
        
//        MainForm home = new MainForm();
//        home.setVisible(true);
        System.out.println("insert \n\n");
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
        
        System.out.println("print\n");
        tree.print();
        
        System.out.println("\n\nsearch");
        Node n1 = tree.searchByTitle("C BB");
        System.out.println("\n"+n1.getTitle()+"  "+n1.getAuthorName()+"  "+n1.getIsbn()+"\n");
        
        System.out.println("\nsearch by keyword\n");
        BinarySearchTree searchResult = tree.searchByKeyword("C");
        searchResult.print();
        
        System.out.println("\ndelete ABB \n");
        tree.deleteByTitle("ABB");
     
        System.out.println("\ntree after delete \n");
        tree.print();
    }
}
