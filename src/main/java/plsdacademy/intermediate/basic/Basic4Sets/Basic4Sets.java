package plsdacademy.intermediate.basic.Basic4Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Basic4Sets {

    public static void main(String[] args) {

        Car car = new Car("Volkswagen", "Golf", "1VWBH7A33DC118080");
        Car car1 = new Car("Audi", "A3", "1FTSW21R08EC46917");
        Car car2 = new Car("Seat", "Leon", "1FTFW1CF6EKF51253");
        Car car3 = new Car("Audi", "A3", "1FMFU17538LA84228");
        Car car4 = new Car("Seat", "Ibiza", "1FTFW1CF6EKF51253");
        Car car5 = new Car(" Volkswagen", "Passat", "1VWBH7A33DC118080");

        Set<Car> hashSet = new HashSet<>();
        hashSet.add(car);
        hashSet.add(car1);
        hashSet.add(car2);
        hashSet.add(car3);
        hashSet.add(car4);
        hashSet.add(car5);

        Set<Car> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(car);
        linkedHashSet.add(car1);
        linkedHashSet.add(car2);
        linkedHashSet.add(car3);
        linkedHashSet.add(car4);
        linkedHashSet.add(car5);

        for (int i = 0; i < hashSet.size(); i++) {

        }
        System.out.println(hashSet);

        for (int i = 0; i < linkedHashSet.size(); i++) {

        }
        System.out.println(linkedHashSet);
    }


}
