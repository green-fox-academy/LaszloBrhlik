public class Exercise02_UrlFixer {
    public static void main(String... args){
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crucial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        String url1 = url.replace("bots", "odds");
        String url2 = url1.replace("https", "https:");

        String url3 = "https:" + url.substring(5,38) + "odds";

        System.out.println(url3);
        System.out.println(url2);
    }
}
