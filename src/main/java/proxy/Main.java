package proxy;

public class Main {
    public static void main(String[] args) {
        Network proxy = new InternetProxy();
        proxy.browse("wikipedia.org");
        proxy.browse("google.com");
        proxy.browse("abc.com");
    }
}
