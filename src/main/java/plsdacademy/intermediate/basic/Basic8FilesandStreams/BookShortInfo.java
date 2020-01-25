package plsdacademy.intermediate.basic.Basic8FilesandStreams;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
class BookShortInfo {

    private String title;
    private String author;
    private int yearPublished;
}