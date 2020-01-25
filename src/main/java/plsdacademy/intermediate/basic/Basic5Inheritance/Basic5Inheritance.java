package plsdacademy.intermediate.basic.Basic5Inheritance;

public class Basic5Inheritance {
    public static void main(String[] args) {

        Developer backendDeveloper = new BackendDeveloper("Piotr", "Ericson", 0.5, "Java");
        Developer frontendDeveloper = new FrontendDeveloper("Adam", "SDA", 999.99, "Angular");
        Developer mobileDeveloper = new MobileDeveloper("Ania", "Google", 10000.0, "Android");

        System.out.println(backendDeveloper);

        backendDeveloper.makeCode();
        frontendDeveloper.makeCode();
        mobileDeveloper.makeCode();


    }
}
