package plsdacademy.intermediate.basic.Basic2Arrays;

public class Person {
    String name;
    String surname;
    String placeOfBirth;
    int age;
    long phone;

    public Person(String name, String surname, String placeOfBirth, int age, long phone) {
        this.name = name;
        this.surname = surname;
        this.placeOfBirth = placeOfBirth;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public int getAge() {
        return age;
    }

    public long getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                '}';
    }
}

