package plsdacademy.intermediate.warmup.warmup3;

public class warmup3 {

    public static void main(String[] args) {
//        Zadeklaruj tablicę intów, np.:
//        int[] array = new int[] { -2, 3, 1, 23, -9, 0, 12, 6, -4 };
//
//        Wypisz na konsolę najwyższą oraz najniższą liczbę z tablicy.
//                Do poszukiwania min i max NIE używaj gotowych metod i bibliotek


        int[] array = new int[]{-2, 3, 1, 23, -9, 0, 12, 6, -4};
        int temp;
        int zmiana = 1;
        while (zmiana > 0) {
            zmiana = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    zmiana++;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            //System.out.print(array[i]+ " ");
        }
        int max = 0;
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }


}
