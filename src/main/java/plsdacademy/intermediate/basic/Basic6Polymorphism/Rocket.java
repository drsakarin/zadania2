package plsdacademy.intermediate.basic.Basic6Polymorphism;

public class Rocket implements Vehicle {

    private static final int MAX_SPEED = Integer.MAX_VALUE;
    private int speed = 0;

    public Rocket() {
    }

    @Override
    public void accelerate() {
        this.speed += 10000;
        if (this.speed > Integer.MAX_VALUE) {
            System.out.println("nie moge wiecej");
        }
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "speed=" + speed +
                '}';
    }


}
