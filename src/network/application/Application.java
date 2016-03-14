package network.application;

/**
 * Imported all for testing purposes to create all posts from here.
 */
import network.core.*;

/**
 * This is the main class of the whole application.
 * Its current purpose is to construct a newsfeed, fill it with posts,
 * and finally display all the posts and its content.
 * 
 * @author Ole Martin
 * @version 0.2
 */
public class Application {
    
private NewsFeed newsFeed;

/**
 * Creates a new newsFeed, then fills the newsfeed with dummy posts. Finally
 * it runs the show method which displays all the posts and its content.
 */
    public Application() {
        newsFeed = new NewsFeed();
        fillDummyPosts();
        newsFeed.show();
    }

    
    /**
     * @param args the command line arguments
     * Main method that initializes the newsfeed by creating a new newsfeed
     */
    public static void main(String[] args) {    
        Application application = new Application();
    }
    
    /**
     * Only for testing purposes!
     * TODO: Remove this method when code is finished.
     */
    private void fillDummyPosts()
    {
        MessagePost message1 = new MessagePost("Leif", "Detta e teit");
        newsFeed.addPost(message1);
        message1.addComment("Oi, ka har skjedd??");
        message1.addComment("Tenk positivt");
        message1.like();
        message1.like();
        MessagePost message2 = new MessagePost("Bjarne", "Endelig fredag!");
        message2.addComment("Eg veit, heilt fantastisk!");
        newsFeed.addPost(message2);
        message2.like();
        PhotoPost photo1 = new PhotoPost("Leif", "fjellet.jpg", "Nydeleg ver!");
        photo1.addComment("Eg vil og ve med!");
        newsFeed.addPost(photo1);
        photo1.like();
        PhotoPost photo2 = new PhotoPost("Oddleif", "slalom.jpg", "Trynte i bakken");
        photo2.addComment("Gjorde da vondt?");
        newsFeed.addPost(photo2);
        EventPost event1 = new EventPost("Ole Ivars", "Danseband i Vrimla 19. mars!");
        newsFeed.addPost(event1);
        event1.attend();
        event1.attend();
        EventPost event2 = new EventPost("Jan Grogg", "Tegnekurs på Sukkertoppen 2. mai!");
        newsFeed.addPost(event2);
    }
    
}