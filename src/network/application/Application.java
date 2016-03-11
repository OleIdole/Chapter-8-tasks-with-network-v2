package network.application;

import network.core.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OleMartin
 */
public class Application {
    
private NewsFeed newsFeed;

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
     * TODO: Remove when method and its call in constructor once the code
     * is finished!
     */
    private void fillDummyPosts()
    {
        MessagePost message1 = new MessagePost("Leif", "Detta e teit");
        newsFeed.addPost(message1);
        message1.addComment("Oi, ka har skjedd??");
        message1.addComment("Tenk positivt");
        MessagePost message2 = new MessagePost("Bjarne", "Endelig fredag!");
        message2.addComment("Eg veit, heilt fantastisk!");
        newsFeed.addPost(message2);
        PhotoPost photo1 = new PhotoPost("Leif", "fjellet.jpg", "Nydeleg ver!");
        photo1.addComment("Eg vil og ve med!");
        newsFeed.addPost(photo1);
        PhotoPost photo2 = new PhotoPost("Oddleif", "slalom.jpg", "Trynte i bakken");
        photo2.addComment("Gjorde da vondt?");
        newsFeed.addPost(photo2);
    }
    
}