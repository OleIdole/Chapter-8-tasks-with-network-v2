package network.core;

import java.util.ArrayList;

/**
 * This is the general class for all posts that should inherit comments.
 * It currently extends from Post and goes further down to PhotoPost and
 * MesagePost.
 * 
 * @author Ole Martin
 * @version 0.2
 */
public class CommentedPost extends Post
{
    private int likes;
    private final ArrayList<String> comments;
    
    /**
     * @param author The username of the author of this post.
     */
    public CommentedPost(String author)
    {
        super(author);
        likes = 0;
        comments = new ArrayList<>();
    }
    
    /**
     * Record one more 'Like' indication from a user.
     */
    public void like()
    {
        likes++;
    }
    
    /**
     * Record that a user has withdrawn his/her 'Like' vote.
     */
    public void unlike()
    {
        if (likes > 0) {
            likes--;
        }
    }
    
    /**
     * Add a comment to this post.
     * 
     * @param text  The new comment to add.
     */
    public void addComment(String text)
    {
        comments.add(text);
    }
    
    /**
     * Returns the amount of likes for this post.
     * @return Returns the amount of likes for this post.
     */
    public int getLikes()
    {
        return likes;
    }
    
    /**
     * Returns the amount of comments for this post.
     * @return Returns the amount of comments for this post.
     */
    public int getAmountOfComments()
    {
        return comments.size();
    }
    
    /**
     * Returns the details of this post.
     * This is not named display() because to get the correct format
     * of the display, we continue to build display() further down and
     * end up using the displayCommented() in that method.
     * @return Returns the details of this post.
     */
    public String displayCommented()
    {
        String commentDetails = "\n";
        if(likes > 0) {
            commentDetails += "   " + likes + " people like this.";
        }
        else {
            commentDetails += "   Be the first person to like this post!";
        }
        
        if(comments.isEmpty()) {
            commentDetails += "\n   No comments.";
        }
        else {
            commentDetails += "\n   " + comments.size()
                    + " comment(s). Click here to view.";
        }
        commentDetails += displayTimestamp();
        return commentDetails;
    }
}
