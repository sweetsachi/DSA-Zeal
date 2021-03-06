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
    
    public void setLeft(Node node)
    {
        this.left = node;
    }
    
    public Node getRight()
    {
        return this.right;
    }
    
    public void setRight(Node node)
    {
        this.right = node;
    }
    
    public Node getParent()
    {
        return this.parent;
    }
    
    public void setParent(Node node)
    {
        this.parent = node;
    }
    
    public String getTitle()
    {
        return this.title;
    }
    
    public void setTitle(String title)
    {
        this.title= title;
    }
    
    public String getAuthorName()
    {
        return this.authorName;
    }
    
    public void setAuthorName(String authorName)
    {
        this.authorName= authorName;
    }
    
    public String getAuthorSurname()
    {
        return this.authorSurname;
    }
    
    public void setAuthorSurname(String authorSurname)
    {
        this.authorSurname= authorSurname;
    }
    
    public int getIsbn()
    {
        return this.isbn;
    }
    
    public void setIsbn(int isbn)
    {
        this.isbn= isbn;
    }
                      
}
