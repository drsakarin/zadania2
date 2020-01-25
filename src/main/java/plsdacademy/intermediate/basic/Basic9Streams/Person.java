package plsdacademy.intermediate.basic.Basic9Streams;

public class Person {
    String name;
    String surname;
    String city;
    int age;
    int pesel;

    public Person(String name, String surname, String city, int age, int pesel) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.age = age;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    public int getPesel() {
        return pesel;
    }
}
