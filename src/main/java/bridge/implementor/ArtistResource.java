package bridge.implementor;

import bridge.models.Artist;

public class ArtistResource implements Resource{

  private final Artist artist;

  public ArtistResource(Artist artist) {
    this.artist = artist;
  }

  @Override
  public String title() {
    return artist.getFirstName() + " " + artist.getLastName();
  }

  @Override
  public String subtitle() {
    return artist.getLastName();
  }

  @Override
  public String image() {
    return artist.getImage();
  }

  @Override
  public String summary() {
    return artist.getBio();
  }
}
