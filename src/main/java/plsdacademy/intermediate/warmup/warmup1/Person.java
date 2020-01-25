package plsdacademy.intermediate.warmup.warmup1;

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
        return
                name + " " + surname + " (ur. " + age + "r.)" +
                        "\n" +
                        "m. ur.: " + placeOfBirth + "\n" +

                        "tel: " + phone;
    }
}
