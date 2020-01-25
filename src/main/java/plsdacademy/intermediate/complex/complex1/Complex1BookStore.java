package plsdacademy.intermediate.complex.complex1;

import plsdacademy.intermediate.basic.Basic8FilesandStreams.Genre;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Complex1BookStore {
    public static void main(String[] args) {

        Book book = new Book(Genre.FANTASY, "ttt", "ssss", 3, 44, 3.5, UUID.randomUUID(), 78);
        book.toBookShortInfo();
        List<BookShortInfo> books = new ArrayList();
        books.add(book.toBookShortInfo());
        System.out.println(books.get(0));
    }
}
