package network.core;

/**
 * This class extends from CommentedPost and in addition to what it inherits,
 * it also contains a message.
 * 
 * @author Ole Martin
 * @version 0.2
 */
public class MessagePost extends CommentedPost
{
    private String message;  // an arbitrarily long, multi-line message

    /**
     * Constructor for objects of class MessagePost.
     * 
     * @param author    The username of the author of this post.
     * @param text      The text of this post.
     */
    public MessagePost(String author, String text)
    {
        super(author);
        message = text;
    }
    
    /**
     * Return the text of this post.
     * 
     * @return The post's message text.
     */
    public String getText()
    {
        return message;
    }
    
    /**
     * Display the details of this post.
     * At this point we finish building up the display() method, you can see we
     * first use the display from Post, then we continue with methods from this
     * class, finally we add the displayCommented() from commentedPost.
     */
    public void display()
    {
        super.display();
        System.out.println(" wrote: " + message);
        super.displayCommented();
    }
}
