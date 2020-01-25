package plsdacademy.intermediate.basic.Basic9Streams;

//import java.util.stream.Stream;

public class Basic9Streams {
    public static void main(String[] args) {

        System.out.println("zmiana");
        System.out.println("zmiana");


//        Stream<String>namesStream = Stream.of("John", "Mary", "George", "Paul", "Alice", "Ann");
//
//        namesStream
//                .filter(e -> e.startsWith("A"))
//                .map(String::toUpperCase)
//                .sorted()
//                .forEach(System.out::println);
//
//        List<String> namesList= Arrays.asList("John", "Marry", "George", "Paul", "Alice", "Ann");
//
//        namesList
//                .stream()
//                .filter(e -> e.startsWith("A"))
//                .map(String::toUpperCase)
//                .sorted()
//                .forEach(System.out::println);
//
//        System.out.println("===================================================================");
//
//        List<String> namesList1= Arrays.asList("John", "Marry", "George", "Paul", "Alice", "Ann");
//
//        namesList1
//                .stream()
//                .filter(name-> {System.out.println("Filteringname: " + name);
//                return true;});   // brak operacji terminującej, wcześniejsza operacja pośrednia filternie jest wykonana
//
//        List<String> namesList2= Arrays.asList("John", "Marry", "George", "Paul", "Alice", "Ann");
//
//        namesList
//                .stream()
//                .filter(name-> {System.out.println("Filteringname: "+ name)
//                ;return true;})
//                .forEach(name-> System.out.println("Nownameisprinted: " + name));// operacja terminująca forEachdodana, wykonane obie operacje (filteri forEach) -wypisane 2 linie dla każdego imieni
//
//        Stream<Integer> numbers= Stream.of(1, 2, 3).filter(number -> {
//            return number > 1;
//        });
//
//        numbers.forEach(System.out::println);
//        System.out.println("---");
//        numbers.forEach(System.out::println);
//
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//
//
//        Person person1 = new Person("Piotr", "Zietek", "Zgierz", 28, 793522944);
//        Person person2 = new Person("Adam", "Malysz", "Wisla", 42, 123456789);
//        Person person3 = new Person("Kasia", "Kowalska", "Warszawa", 14, 111222333);
//
//        List<Person> allPersons= Arrays.asList(person1, person2, person3);
//
//        allPersons
//                .stream()
//                .filter(person -> person.getAge() >= 18)
//                .forEach(person -> System.out.println("Person: " + person.getName() + " isadult."));
//
//        Person person4 = new Person("Piotr", "Zietek", "Zgierz", 28, 793522944);
//        Person person5 = new Person("Adam", "Malysz", "Wisla", 42, 123456789);
//        Person person6 = new Person("Kasia", "Kowalska", "Warszawa", 14, 111);
//
//        List<Person> allPersons1= Arrays.asList(person1, person2, person3);
//        allPersons1
//                .stream()
//                .filter(person -> person.getAge() >= 18)
//
//        // do tej pory mamy strumień elementów typu Person
//        .map(person -> person.getName()) // albo z wykorzystaniem referencji do metody: Person::getName
//        // teraz mamy strumień typu String
//
//        .forEach(name-> System.out.println("Person: " + name+ " isadult."));
//
//        Person person7 = new Person("Piotr", "Zietek", "Zgierz", 28, 793522944);
//        Person person8 = new Person("Adam", "Malysz", "Wisla", 42, 123456789);
//        Person person9 = new Person("Kasia", "Kowalska", "Warszawa", 14, 111222333);
//
//        List<Person> allPersons3= Arrays.asList(person1, person2, person3);
//        allPersons3
//                .stream()
//                .skip(1)
//                .forEach(person -> System.out.println("Hello, " + person.getName()));
//
//
//        List<Person> allPersons4= Arrays.asList(person1, person2, person3);
//        allPersons4
//                .stream()
//                .limit(2)
//                .forEach(person -> System.out.println("Hello, " + person.getName()));
//
//
//
//        Person person10 = new Person("Piotr", "Zietek", "Zgierz", 28, 793522944);
//        Person person11 = new Person("Adam", "Malysz", "Wisla", 42, 123456789);
//        Person person12 = new Person("Kasia", "Kowalska", "Warszawa", 14, 111222333);
//
//
//        List<Person> allPersons5= Arrays.asList(person1, person2, person3);
//        allPersons5
//                .stream()
//                .map(Person::getName).sorted() // naturalorder, alfabetycznie
//         .forEach(name -> System.out.println("Hello, " + name));
//
//        allPersons5
//                .stream()
//                .map(Person::getName)
//                .sorted(Comparator.reverseOrder()) // alfabetycznie, odwrotnie
//         .forEach(name -> System.out.println("Hello, " + name));
//


    }

}




