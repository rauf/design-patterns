package bridge.models;

import lombok.Getter;

@Getter
public class Artist {
  private final String firstName;
  private final String lastName;
  private final String bio;
  private final String image;

  public Artist(String firstName, String lastName, String bio, String image) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.bio = bio;
    this.image = image;
  }
}
