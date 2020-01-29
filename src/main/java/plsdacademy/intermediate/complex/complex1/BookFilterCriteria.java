package plsdacademy.intermediate.complex.complex1;

import lombok.Builder;

@Builder
class BookFilterCriteria {

    String titlePart;
    String authorPart;
    IntRange yearsRange;
    IntRange pagesRange;
    DoubleRange priceRange;


    boolean matches(Book book) {
        boolean result = true;
        if (yearsRange != null)
            result &= yearsRange.contains(book.getYearPublished());
        if (pagesRange != null)
            result &= pagesRange.contains(book.getNumberOfPages());
        if (priceRange != null)
            result &= priceRange.contains(book.getPrice());
        if (titlePart != null) {
            result &= book.getTitle().toLowerCase().contains(titlePart.toLowerCase());
        }
        if (authorPart != null) {
            result &= book.getAuthor().toLowerCase().contains(authorPart.toLowerCase());
        }
        return result;
    }


}
