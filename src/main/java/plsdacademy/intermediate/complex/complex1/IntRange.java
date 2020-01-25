package plsdacademy.intermediate.complex.complex1;

 class IntRange {

     int min;
     int max;


     IntRange(int min, int max) {
         this.min = min;
         this.max = max;
     }

    boolean contains(int num) {
        if (num >= min && num <= max)
            return true;
        return false;
    }


}
