package network.core;

import java.util.ArrayList;

/**
 * This newsfeed is improved gradually by progressing through chapter 8.
 * Currently it contains a variety of posts.
 * It has a show method that allows us to display all the content of the posts.
 * 
 * @author Ole Martin
 * @version 0.2
 */
public class NewsFeed
{
    private final ArrayList<Post> posts;

    /**
     * Construct an empty news feed.
     */
    public NewsFeed()
    {
        posts = new ArrayList<>();
    }

    /**
     * Add a post to the news feed.
     * 
     * @param post  The post to be added.
     */
    public void addPost(Post post)
    {
        posts.add(post);
    }

    /**
     * Iterates over all the posts and displays its content.
     * The display method will go through several classes as they
     * inherit from eachother.
     */
    public void show()
    {
        // display all posts
        for(Post post : posts) {
            System.out.println(post.display());
            System.out.println();   // empty line between posts
        }
    }
}
