package challenges;

import java.util.function.BinaryOperator;

/**
 * cha106
 */
public class cha107 {

    // this is a lambda question chack kg coding q 

    public static void main(String[] args) {
        
      BinaryOperator<Integer> multi = (a , b) -> a*b;
      
     int result = multi.apply(2, 2);
     System.out.println(result);

    }
}