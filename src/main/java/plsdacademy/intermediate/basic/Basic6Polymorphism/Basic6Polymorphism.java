package plsdacademy.intermediate.basic.Basic6Polymorphism;

public class Basic6Polymorphism {
    int times;

    public static void main(String[] args) {
        Vehicle motorbike = new Motorbike();
        Vehicle bicycle = new Bicycle();
        Vehicle rocket = new Rocket();

        motorbike.accelerate();

        moveNTimesFast(motorbike, 4);

        moveNTimesFast(motorbike, 4);
        bicycle.accelerate();
        moveNTimesFast(bicycle, 10);


    }


    public static int moveNTimesFast(Vehicle vehicle, int times) {

        System.out.println(times * vehicle.getSpeed());
        return times;
    }
}