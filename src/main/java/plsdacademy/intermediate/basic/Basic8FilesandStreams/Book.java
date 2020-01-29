package plsdacademy.intermediate.basic.Basic8FilesandStreams;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
class Book {

  private String title;
  private String author;
  private int yearPublished;
  private int numberOfPages;
  private double price;
  private Genre genre;


}
