package plsdacademy.intermediate.complex.complex1;

import lombok.Builder;

@Builder

public class BookFilterCriteria {

    String titlePart;
    String authorPart;
    IntRange yearsRange;
    IntRange pagesRange;
    DoubleRange priceRange;


}
