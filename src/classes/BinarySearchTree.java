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
        
        if (root == null)
        {
            root = newNode;
        }
        
        traverseAndAdd(root, newNode);
        
    }
    
    private void traverseAndAdd(Node node, Node newNode)
    {
        if( newNode.getTitle().compareTo(node.getTitle()) < 0)
        {
            if( node.getLeft() == null)
            {
                node.setLeft(newNode);
            }
            else
            {
                traverseAndAdd(node.getLeft(), newNode);
            }
        }
        else if( newNode.getTitle().compareTo(node.getTitle()) > 0)
        {
            if( node.getRight() == null)
            {
                node.setRight(newNode);
            }
            else
            {
                traverseAndAdd(node.getRight(), newNode);
            }
        }
    }
    
    public void print()
    {
        if(root != null)
        {
            Node nodeToTraverse = root;
            
            if(nodeToTraverse.getLeft() == null && nodeToTraverse.getRight() == null)
            {
                System.out.println(nodeToTraverse.getTitle());
            }
            else
            {
                if(nodeToTraverse.getLeft() != null)
                {
                    inOrderTraversal(nodeToTraverse.getLeft());
                }
                if(nodeToTraverse.getRight() != null)
                {
                    inOrderTraversal(nodeToTraverse.getRight());
                }
                
            }
            
        }
    }
    
    private void inOrderTraversal(Node node)
    {
        if(node.getLeft() != null)
        {
            inOrderTraversal(node.getLeft());
        }
        
        System.out.println(node.getTitle());
        
        if(node.getRight() != null)
        { 
            inOrderTraversal(node.getRight());
        }
    }
    
}
