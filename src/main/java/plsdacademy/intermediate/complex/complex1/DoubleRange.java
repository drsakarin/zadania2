package plsdacademy.intermediate.complex.complex1;

public class DoubleRange {

    double min, max;

    public DoubleRange(double min, double max) {
        this.min = min;
        this.max = max;
    }

    boolean contains(double num) {
        if (num >= min && num <= max)
            return true;
        return false;
    }
}
