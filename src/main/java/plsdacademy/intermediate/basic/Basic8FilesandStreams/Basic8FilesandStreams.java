package plsdacademy.intermediate.basic.Basic8FilesandStreams;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

class Basic8FilesandStreams {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();

        List<String> allAuthors = bookStore.getBooks()
                .stream()
                .map(Book::getAuthor)
                .distinct()
                .collect(Collectors.toList());

        int numberOfAllSapkowskiBooks = bookStore.findBooksByAuthor("Andrzej Sapkowski").size();

        double totalCostOfSomeFantasyBooks = bookStore.findBooksByGenre(Genre.FANTASY)
                .stream()
                .filter(book -> book.getYearPublished() >= 1990 && book.getYearPublished() <= 1999)
                .filter(book -> BigDecimal.valueOf(book.getPrice()).compareTo(BigDecimal.valueOf(40.0)) > 0)
                .mapToDouble(Book::getPrice)        // method reference - used when calling only 1 method for all elements
                // equivalent of lambda: book -> book.getPrice()
                .sum();


        List<BookShortInfo> shortInfoAboutSomeCrimeBooks
                = bookStore.findBooksByGenre(Genre.CRIME_STORY)
                .stream()
                .filter(book -> book.getAuthor().equals("Harlan Coben"))
                .filter(book -> book.getNumberOfPages() <= 300)
                .skip(2)
                .map(book -> BookShortInfo.builder()
                        .title(book.getTitle())
                        .author(book.getAuthor())
                        .yearPublished(book.getYearPublished())
                        .build())
                .collect(Collectors.toList());


    }

}
