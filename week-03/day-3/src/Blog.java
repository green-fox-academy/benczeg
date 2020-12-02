import java.util.ArrayList;

public class Blog {
   /* store a list of BlogPosts
    add BlogPosts to the list
    delete(int) one item at given index
    update(int, BlogPost) one item at the given index and update it with another BlogPost*/

    ArrayList<BlogPost> postList = new ArrayList<>();

    public void add(BlogPost post) {
        postList.add(post);
    }

    public void delete(int indexOfPost) {
        postList.remove(indexOfPost);
    }

    public void update(int indexOfPost, BlogPost post) {
        delete(indexOfPost);
        add(post);
    }
}

