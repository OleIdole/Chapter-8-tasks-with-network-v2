package network.core;

/**
 * This class stores information about the posts. The fields here are the ones
 * that all the under-classes in this hierachy has in common.
 * The reason why there are several display method originally had
 * both author and timestamp in it, but had to split this up to allow the
 * author to appear on top of display, and timestamp to appear under the
 * under-class's part of the method.
 * 
 * @author Ole Martin
 * @version 0.2
 */
public class Post 
{
    private final String username;  // username of the post's author
    private final long timestamp;
    
    /**
     * Constructor for objects of class Post.
     * @param author Name of the post's author.
     */
    public Post(String author)
    {
        username = author;
        timestamp = System.currentTimeMillis();
    }

    /**
     * Returns the username of the post's author
     * @return Returns the username of the post's author
     */
    public String getUserName()
    {
        return username;
    }

    /**
     * Return the time of creation of this post.
     * 
     * @return The post's creation time, as a system time value.
     */
    public long getTimeStamp()
    {
        return timestamp;
    }

    /**
     * Returns the details of this post.
     * 
     * This method is further built lower in the hierarchy. From this method,
     * it currently splits to CommentedPost and EventPost.
     * @return Returns the details of this post.
     */
    public String display()
    {
        return username;
    }
    
    /**
     * Returns the time differense between current and when post was created.
     * @return Returns the time differense between current and when post was created.
     */
    public String displayTimestamp()
    {
        return "\n      " + timeString(timestamp);
    }
    
    /**
     * Create a string describing a time point in the past in terms 
     * relative to current time, such as "30 seconds ago" or "7 minutes ago".
     * Currently, only seconds and minutes are used for the string.
     * 
     * @param time  The time value to convert (in system milliseconds)
     * @return      A relative time string for the given time
     */
    
    private String timeString(long time)
    {
        long current = System.currentTimeMillis();
        long pastMillis = current - time;      // time passed in milliseconds
        long seconds = pastMillis/1000;
        long minutes = seconds/60;
        if(minutes > 0) {
            return "Posted " + minutes + " minutes ago";
        }
        else {
            return "Posted " + seconds + " seconds ago";
        }
    }
}
