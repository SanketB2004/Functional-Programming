package challenges;

import java.util.List;
import java.util.function.BinaryOperator;

/**
 * cha106
 */
public class cha106 {

    // this is a lambda question chack kg coding q 

    public static void main(String[] args) {
        
      List<String> fruts = List.of( "Apple",
    "Mango",
    "Banana",
    "Orange",
    "Grapes",
    "Papaya",
    "Guava",
    "Pineapple");

     fruts.stream()
    .forEach(frut2s -> System.out.println(frut2s));

    
    }
    
}