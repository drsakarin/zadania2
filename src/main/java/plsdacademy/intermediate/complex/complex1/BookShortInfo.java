package plsdacademy.intermediate.complex.complex1;

import lombok.Builder;
import lombok.ToString;

import java.util.UUID;

@Builder
@ToString
class BookShortInfo {

    String title;
    String author;
    int yearPublished;
    UUID id;


}