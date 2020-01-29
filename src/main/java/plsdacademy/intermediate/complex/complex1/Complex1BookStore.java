package plsdacademy.intermediate.complex.complex1;

import java.util.List;
import java.util.UUID;

public class Complex1BookStore {
    public static void main(String[] args) {

        Book book = new Book(Genre.FANTASY, "aa", "bb", 1999, 300, 50.20,
                UUID.randomUUID(), 3);


        BookStore bookStore = new BookStore();

        BookFilterCriteria bookFilterCriteria = BookFilterCriteria.builder()
                .titlePart("ottr")
                .pagesRange(new IntRange(300, 700))
                .build();


        List<Book> foundBooks = bookStore.findBooks(bookFilterCriteria);
        foundBooks
                .forEach(System.out::println);


        bookStore.addBook(book);

        bookStore.buyBook(book, 1, 50);
        System.out.println("----------------------------------------");


//        for (int i = 0; i < bookStore.getBooks().size(); i++) {
//
//        }
//            System.out.println(bookStore.getBooks().size();
//
//

    }
}