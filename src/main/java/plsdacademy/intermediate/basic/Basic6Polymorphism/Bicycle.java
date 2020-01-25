package plsdacademy.intermediate.basic.Basic6Polymorphism;

public class Bicycle implements Vehicle {

    private static final int MAX_SPEED = 50;
    private int speed = 0;

    public Bicycle() {
    }


    @Override
    public void accelerate() {
        this.speed += 5;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "speed=" + speed +
                '}';
    }
}
