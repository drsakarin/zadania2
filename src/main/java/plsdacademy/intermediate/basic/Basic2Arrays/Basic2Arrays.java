package plsdacademy.intermediate.basic.Basic2Arrays;

import java.util.ArrayList;
import java.util.List;

public class Basic2Arrays {
    public static void main(String[] args) {

        Person person = new Person("Adam", "Nowak", "Łódź", 17, 10);
        Person person1 = new Person("Piotr", "Fratczak", "Łódź", 30, 11);
        Person person2 = new Person("Grzech", "Fratczak", "Łódź", 35, 12);
        Person person3 = new Person("Wojtek", "Fratczak", "Łódź", 34, 13);
        Person person4 = new Person("MAciek", "Fratczak", "Łódź", 12, 14);

        List<Person> list = new ArrayList<Person>();

        list.add(person);
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list);
        }


        for (Person osoba : list) {
            if (osoba.getAge() > 20)
                System.out.println(osoba);
        }
        for (Person osoba : list) {
            if (osoba.getPhone() % 2 != 1) {
                System.out.println(osoba);
            }
        }
        System.out.println(list);

        int suma = 0;
        for (Person osoba1 : list) {

            suma = suma + osoba1.getAge();

        }
        System.out.println("suma wieku pierwszej listy" + suma);

        System.out.println("koniec pierwsze czesci");


        List<Person> kopiaListy = new ArrayList<Person>(list); //kopia listy

        for (int i = 0; i < kopiaListy.size(); i++) {

            System.out.println(kopiaListy);
        }
        list.remove(person3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("list po usunięciu element" + list);

        }

        int suma2 = 0;
        for (Person osoba2 : kopiaListy) {

            suma2 = suma2 + osoba2.getAge();

        }
        System.out.println("suma wieku drugiej listy" + suma2);


    }
}

