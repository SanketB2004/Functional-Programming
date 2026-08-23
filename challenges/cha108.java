package challenges;

import java.util.List;

public class cha108 {
    // concinate
    public static void main(String[] args) {
        
      List<String> str = List.of( "Apple",
    "Mango","Great", 
    "Banana",
    "Orange is Greet","Bad",
    "Grapes",
    "Papaya is sweet test",
    "Guava",
    "Pineapple cute test intresting");

    String result =  str.stream()
    .filter(strr -> strr.length() > 6)
    .reduce("" , (a ,b) -> a+" " +b);

System.out.println(result);
    
    }
    
}
