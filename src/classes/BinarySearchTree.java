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
                newNode.setParent(node);
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
                newNode.setParent(node);
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
                System.out.println(nodeToTraverse.getTitle());
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
    
    public void searchByTitle(String title) // return the node
    {
        Node result = new Node();
        if(root != null)
        {
            result = findByTitle(root, title);
        }
        
        System.out.println(result.getTitle());
        //return null;
    }
    
    private Node findByTitle(Node search, String title)
    {
        if(search == null)
        {
            return null;
        }
        
        if(search.getTitle().compareTo(title) == 0)
        {
            return search;
        }
        else
        {
            Node returnNode = findByTitle(search.getLeft(), title);
            
            if(returnNode == null)
            {
                returnNode = findByTitle(search.getRight(), title);
            }
            return returnNode;
        }
    }
    
    public boolean deleteByTitle(String title)
    {
        Node deleteNode = findByTitle(root, title); // use searchByTitle()
        
        if(deleteNode != null)
        {
            delete(deleteNode);
        }
        
        return false;
    }
    
    private void delete(Node deleteNode)
    {
        if(deleteNode.getLeft() == null && deleteNode.getRight() == null) // has no children
        {
            if(deleteNode.getParent().getLeft() == deleteNode)
            {
                deleteNode.getParent().setLeft(null);
            }
            else if(deleteNode.getParent().getRight() == deleteNode)
            {
                deleteNode.getParent().setRight(null);
            }
        }
        else if(deleteNode.getLeft() != null && deleteNode.getRight() != null) // has both children
        {
            Node candidate = getCandidate(deleteNode.getRight());
            
            delete(candidate);
            
            candidate.setParent(deleteNode.getParent());
            candidate.setLeft(deleteNode.getLeft());
            candidate.setRight(deleteNode.getRight());
            
            if(deleteNode.getParent() == null)
            {
                root = candidate;
            }
            else
            {
                if(deleteNode.getParent().getLeft() == deleteNode)
                {
                    deleteNode.getParent().setLeft(candidate);
                }
                else if(deleteNode.getParent().getRight() == deleteNode)
                {
                    deleteNode.getParent().setRight(candidate);
                }
            }
            
        }
        else if(deleteNode.getLeft() != null) // has only left child
        {
            deleteInternalNode(deleteNode);
        }
        else if(deleteNode.getRight() != null) // has only right child
        {
            deleteInternalNode(deleteNode);
        }
    }
    
    private void deleteInternalNode(Node deleteNode) // has only one child
    {
        if(deleteNode.getParent() == null) // is the root
        {
            Node candidate = getCandidate(deleteNode.getRight());
            delete(candidate);
            candidate.setLeft(deleteNode.getLeft());
            candidate.setRight(deleteNode.getRight());
            root = candidate;
        }
        else
        {
        
            if(deleteNode.getParent().getLeft() == deleteNode)
            {
                if(deleteNode.getLeft() != null)
                {
                    deleteNode.getParent().setLeft(deleteNode.getLeft());
                }
                else if(deleteNode.getRight() != null)
                {
                    deleteNode.getParent().setLeft(deleteNode.getRight());
                }
            }
            else if(deleteNode.getParent().getRight() == deleteNode)
            {
                if(deleteNode.getLeft() != null)
                {
                    deleteNode.getParent().setRight(deleteNode.getLeft());
                }
                else if(deleteNode.getRight() != null)
                {
                    deleteNode.getParent().setRight(deleteNode.getRight());
                }
            }
        }
    }
    
    private Node getCandidate(Node node)
    {
        if(node.getLeft() == null)
        {
            return node;
        }
        else
        {
            return getCandidate(node.getLeft());
        }
    }
    
}
