package plsdacademy.intermediate.complex.complex1;

public class IntRange {

    int min;
    int max;


    public IntRange(int min, int max) {
        this.min = min;
        this.max = max;
    }

    boolean contains(int num) {
        if (num >= min && num <= max)
            return true;
        return false;
    }


}
