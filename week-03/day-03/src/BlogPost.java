public class BlogPost {
  private String authorName;
  private String title;
  private String text;
  private String publicationDate;
  private String blogPostObject;

  public BlogPost(String authorName, String title, String text, String publicationDate) {
    this.authorName = authorName;
    this.title = title;
    this.text = text;
    this.publicationDate = publicationDate;
    this.blogPostObject = ("\""+title+"\""+" titled by "+authorName+" posted at "+ "\""+publicationDate+"\""+"\n"+text);
    System.out.println(blogPostObject);
  }
}
