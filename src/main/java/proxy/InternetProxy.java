package proxy;

import java.util.List;

public class InternetProxy implements Network {

    private List<String> blockedWebsites;
    private Internet internet;

    public InternetProxy() {
        this.internet = new Internet();
        this.blockedWebsites = List.of("abc.com", "xyz.net");
    }

    @Override
    public void browse(String website) {
        if (blockedWebsites.contains(website))
            throw new RuntimeException("Cannot access website: " + website);
        internet.browse(website);
    }
}
