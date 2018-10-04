package bridge;

import bridge.models.Artist;
import bridge.models.Book;
import bridge.implementor.ArtistResource;
import bridge.implementor.BookResource;
import bridge.abstraction.LongView;
import bridge.abstraction.ShortView;
import bridge.abstraction.View;

// decouple an abstraction from its implementation so that the two can vary independently
// cross product of independent hierarchies
public class Main {

  public static void main(String[] args) {
    Book harryPotterBook = new Book("Harry Potter", "J.K.Rowling", "summary of harry potter", "ImageHarry");
    View longFormBookView = new LongView(new BookResource(harryPotterBook));
    View shortFormBookView = new ShortView(new BookResource(harryPotterBook));

    System.out.println("Book Long Form: \n" + longFormBookView.show());
    System.out.println("\n\nBook Short Form: \n" + shortFormBookView.show());

    Artist artist = new Artist("Joanne", "Rowling", "Author of Harry Potter series", "ImageRowling");
    View longFormArtistView = new LongView(new ArtistResource(artist));
    View shortFormArtistView = new ShortView(new ArtistResource(artist));

    System.out.println("\n\n\nArtist Long Form: \n" + longFormArtistView.show());
    System.out.println("\n\nArtist Short Form: \n" + shortFormArtistView.show());

  }
}
