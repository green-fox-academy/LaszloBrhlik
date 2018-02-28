public class Exercise02_BlogPostMain {
  public static void main(String[] args) {
    Exercise02_BlogPost blogPostObject1 = new Exercise02_BlogPost("John Doe", "Lorem Ipsum",
            "Lorem ipsum dolor sit amet.", "2000.05.04.");
    Exercise02_BlogPost blogPostObject2 = new Exercise02_BlogPost("Tim Urban", "Wait but why",
            "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10.");
    Exercise02_BlogPost blogPostObject3 = new Exercise02_BlogPost("William Turton", "One Engineer " +
            "Is Trying to Get IBM to Reckon With Trump",
            "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. " +
                    "When I asked to take his picture outside one of IBM’s New York City offices, he told me that " +
                    "he wasn’t really into the whole organizer profile thing.", "2017.03.28.");
  }
}
