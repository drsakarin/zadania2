package plsdacademy.intermediate.basic.Basic4Sets;

public class Car {
    String marka;
    String model;
    String VIN;


    public Car(String marka, String model, String VIN) {
        this.marka = marka;
        this.model = model;
        this.VIN = VIN;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return VIN.equals(car.VIN);
    }

    @Override
    public int hashCode() {
        return VIN.hashCode();
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", VIN='" + VIN + '\'' +
                '}';
    }
}
