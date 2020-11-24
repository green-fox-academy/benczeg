// Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
// Also, the URL is missing a crucial component, find out what it is and insert it too!
// Try to solve it more than once using different String functions!

public class UrlFixer {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";
        String changed = url.replace("bots", "odds");
        url = changed;
        changed = url.replace("https", "https:");
        url = changed;
        System.out.println(url);
    }
}
