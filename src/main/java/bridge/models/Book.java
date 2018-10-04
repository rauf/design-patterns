package bridge.models;

import lombok.Getter;

@Getter
public class Book {
  private final String title;
  private final String author;
  private final String summary;
  private final String coverImage;

  public Book(String title, String author, String summary, String coverImage) {
    this.title = title;
    this.author = author;
    this.summary = summary;
    this.coverImage = coverImage;
  }
}
