package bridge.implementor;

import bridge.models.Book;

public class BookResource implements Resource {

  private final Book book;

  public BookResource(Book book) {
    this.book = book;
  }

  @Override
  public String title() {
    return book.getTitle();
  }

  @Override
  public String subtitle() {
    return book.getAuthor();
  }

  @Override
  public String image() {
    return book.getCoverImage();
  }

  @Override
  public String summary() {
    return book.getSummary();
  }
}
