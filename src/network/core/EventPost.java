package network.core;

/**
 * This class extends from Post and is made to create events.
 * Events currently does on contain comments, which is why it extends
 * directly from Post.
 * 
 * @author Ole Martin
 * @version 0.2
 */
public class EventPost extends Post
{
    private String eventType;
    private int participants;

    public EventPost(String author, String eventType)
    {
        super(author);
        this.eventType = eventType;
    }
    
    /**
     * Display the details of this post.
     * At this point we finish building up the display() method, you can see we
     * first use the display from Post, then we continue with methods from this
     * class, and finally we add the timestamp from Post.
     */
    public void display()
    {
        super.display();
        System.out.println("  -  " + "Happening: " + eventType);
        System.out.println("   " + participants + " people are going to this event.");
        super.displayTimestamp();
    }
    
    /**
     * Record one more participant to the event.
     */
    public void attend()
    {
        participants++;
    }
    
    /**
     * Record one less participant to the event.
     */
    public void unattend()
    {
        if (participants > 0) {
            participants--;
        }
    }
    
}
