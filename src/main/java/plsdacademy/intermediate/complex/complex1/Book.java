package plsdacademy.intermediate.complex.complex1;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

@Builder
@ToString
@Getter
class Book {

    Genre genre;
    String title;
    String author;
    int yearPublished;
    int numberOfPages;
    double price;

    @Builder.Default
    UUID id = UUID.randomUUID();
    @Builder.Default
    int amount = 3;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return id.equals(book.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    protected BookShortInfo toBookShortInfo() {
        return BookShortInfo.builder()
                .title(this.title)
                .author(this.author)
                .yearPublished(this.yearPublished)
                .id(this.id)
                .build();
    }


}
