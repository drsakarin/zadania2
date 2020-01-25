package plsdacademy.intermediate.basic.Basic8FilesandStreams;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter

public class Book {

    String title;
    String author;
    int yearPublished;
    int numberOfPages;
    double price;
    private plsdacademy.intermediate.basic.Basic8FilesandStreams.Genre genre;


}
