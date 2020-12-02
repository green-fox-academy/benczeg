public class BlogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;

    public BlogPost(String author, String theTitle, String theText, String dateOfPublication){
        authorName = author;
        title = theTitle;
        text = theText;
        publicationDate = dateOfPublication;
    }
}
