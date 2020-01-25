package plsdacademy.intermediate.warmup.warmup2;

public class warmup2 {

    public static void main(String[] args) {

        //Zadeklaruj tablicę Stringów, np.:
        //String[] array = new String[] { "abc", "cde", "efghijk", "lmnopr", "st", "u", "vwxyz" };
        //
        //Wypisz na konsolę sumę długości wszystkich elementów tablicy.

        String[] array = new String[]{"abc", "cde", "efghijk", "lmnopr", "st", "u", "vwxyz"};
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            temp = temp + array[i].length();

        }
        System.out.print(temp);


    }
}
