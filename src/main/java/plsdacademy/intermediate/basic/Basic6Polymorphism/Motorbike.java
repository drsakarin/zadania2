package plsdacademy.intermediate.basic.Basic6Polymorphism;

public class Motorbike implements Vehicle {

    private static final int MAX_SPEED = 300;
    private int speed = 0;

    public Motorbike() {
    }


    @Override
    public String toString() {
        return "Motorbike{" +
                "speed=" + speed +
                '}';
    }


    public int getSpeed() {
        return speed;
    }

    public void accelerate() {
        this.speed += 30;
        if (this.speed > MAX_SPEED) {
            System.out.println("wiecej nie moge");
        }


    }


}
