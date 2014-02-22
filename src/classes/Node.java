/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author HP
 */
public class Node {
    
    private String title;
    private String authorName;
    private String authorSurname;
    private int isbn;
    
    private Node parent;
    private Node left;
    private Node right;
    
    public Node (String title, String authorName,String authorSurname,int isbn )
    {
        this.title = title;
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.isbn = isbn;
        
        this.left = null;
        this.right = null;
        this.parent = null;
    }
    
    public Node()
    {}
    
    public Node getLeft()
    {
        return this.left;
    }
    
    public Node getRight()
    {
        return this.right;
    }
    
    public String getTitle()
    {
        return this.title;
    }
    
    public int getIsbn()
    {
        return this.isbn;
    }
                      
}
