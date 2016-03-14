package network.core;

/**
 * This class extends from CommentedPost and in addition to what it inherits,
 * it also contains a filename and a caption.
 * 
 * @author Ole Martin
 * @version 0.2
 */
public class PhotoPost extends CommentedPost
{
    private String filename;  // the name of the image file
    private String caption;   // a one line image caption

    /**
     * Constructor for objects of class PhotoPost.
     * 
     * @param author    The username of the author of this post.
     * @param filename  The filename of the image in this post.
     * @param caption   A caption for the image.
     */
    public PhotoPost(String author, String filename, String caption)
    {
        super(author);
        this.filename = filename;
        this.caption = caption;
    }
    
    /**
     * Return the file name of the image in this post.
     * 
     * @return The post's image file name.
     */
    public String getImageFile()
    {
        return filename;
    }

    /**
     * Return the caption of the image of this post.
     * 
     * @return The image's caption.
     */
    public String getCaption()
    {
        return caption;
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
        System.out.println(" posted: " + filename);
        System.out.println("Caption: " + caption);
        super.displayCommented();
    }
}
