/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author HP
 */
public class BinarySearchTree
{
    Node root;
    
    public void insert(String title, String authorName, String authorSurname, int isbn)
    {
        Node newNode = new Node(title, authorName, authorSurname, isbn);
        
    }
}
