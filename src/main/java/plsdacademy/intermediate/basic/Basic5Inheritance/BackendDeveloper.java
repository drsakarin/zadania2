package plsdacademy.intermediate.basic.Basic5Inheritance;

public class BackendDeveloper extends Developer {

    String backendLanguage;

    public BackendDeveloper(String name, String company, double salary, String backendLanguage) {
        super(name, company, salary);
        this.backendLanguage = backendLanguage;
    }

    @Override
    void makeCode() {
        System.out.println("Piotr is coding for Ericsson for 0.5 PLN in Java");
        //System.out.println();

    }

    @Override
    public String toString() {
        return "BackendDeveloper{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }
}
