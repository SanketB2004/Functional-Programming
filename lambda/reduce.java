package lambda;

import java.util.List;
import java.util.function.BinaryOperator;

public class reduce {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        int result = numbers.stream()
                // .reduce(0, new BinaryOperator<Integer>() {

                //     @Override
                //     public Integer apply(Integer a, Integer b) {
                //         return a + b;
                //     }
                // });

                .reduce(0,(a,b) ->a+b);

        System.out.println(result);
    }
}