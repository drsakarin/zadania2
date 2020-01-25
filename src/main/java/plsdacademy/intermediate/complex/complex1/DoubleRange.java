package plsdacademy.intermediate.complex.complex1;

 class DoubleRange {

     double min, max;

     DoubleRange(double min, double max) {
         this.min = min;
         this.max = max;
     }

     boolean contains(double num) {
         if (num >= min && num <= max)
            return true;
        return false;
    }
}
