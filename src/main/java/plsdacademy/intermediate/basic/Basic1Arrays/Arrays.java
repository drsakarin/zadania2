package plsdacademy.intermediate.basic.Basic1Arrays;

public class Arrays {


    public static int[] initXYZarrays() {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i;
            System.out.print(array[i]);
        }
        return array;
    }

    public static int[] initFibonacciarrays() {

        int[] fibonacciarray = new int[10];
        fibonacciarray[0] = 0;
        fibonacciarray[1] = 1;

        int suma = 0;
        for (int i = 2; i < 10; i++) {

            fibonacciarray[i] = fibonacciarray[i - 1] + fibonacciarray[i - 2];

            //System.out.print( fibonacciarray[i] + " ");
        }

        return fibonacciarray;
    }

    public static int[] ArraysallElementfromTheEnd() {
        int[] array = new int[10];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = i;

            System.out.print(array[i] + " ");
        }
        return array;
    }


    public static int[] onlyNotPairElement() {
        int[] array = new int[10];

        int parzysta;
        for (int i = 0; i < array.length; i++) {


            System.out.print(array[i] + " ");

        }
        return array;

    }
}
