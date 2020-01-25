package plsdacademy.intermediate.basic.Basic5Inheritance;

public class MobileDeveloper extends Developer {
    String mobileOs;

    public MobileDeveloper(String name, String company, double salary, String mobileOs) {
        super(name, company, salary);
        this.mobileOs = mobileOs;
    }

    @Override
    void makeCode() {

        System.out.println("Ania is coding for Google for 100000.0 in Android");
    }
}
