package proxy;

// real subject
public class Internet implements Network {

    @Override
    public void browse(String website) {
        System.out.println("Browsing website " + website);
    }
}
