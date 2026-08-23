package methodref;
import java.util.*;
public class methodref01{

    public static void main(String[] args){

        List<Integer> number = List.of(1,2,3,4,5,6,7,8,9);
        
        number.stream()
        .filter(num -> num % 2 == 1)
        .forEach(System.out::println); // method ref this is short cut types method its use a make shortcuts  
    }
}

// compare age 
// package methodref;

// import java.util.*;

// class Person {

//     String name;
//     int age;

//     Person(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     static int compareAge(Person p1, Person p2) {
//         return Integer.compare(p1.age, p2.age);
//     }

//     public String toString() {
//         return name + " - " + age;
//     }
// }

// public class methodref04 {

//     public static void main(String[] args) {

//         List<Person> people = List.of(
//                 new Person("Sanket", 22),
//                 new Person("Rahul", 20),
//                 new Person("Amit", 25)
//         );

//         people.stream()
//                 .sorted(Person::compareAge)
//                 .forEach(System.out::println);
//     }
// }










// compare to 

// package methodref;

// import java.util.*;

// public class methodref03 {

//     public static void main(String[] args) {

//         List<String> fruits = List.of(
//                 "Mango",
//                 "Apple",
//                 "Orange",
//                 "Banana"
//         );

//         fruits.stream()
//                 .sorted(String::compareTo)
//                 .forEach(System.out::println);
//     }
// }


//compare to 
// package methodref;

// import java.util.*;

// public class methodref02 {

//     public static void main(String[] args) {

//         List<Integer> number = List.of(5, 2, 8, 1, 4, 3);

//         number.stream()
//                 .sorted(Integer::compareTo)
//                 .forEach(System.out::println);
//     }
// }