package plsdacademy.intermediate.basic.Basic9Streams;

import java.util.Arrays;
import java.util.List;

public class Streamy {

    public static void main(String[] args) {


        List<Integer> firstList = Arrays.asList(7, 1, 2, 3);

        firstList
                .stream()
                //.peek()

                .sorted()
                .forEach(System.out::println);


    }

}





