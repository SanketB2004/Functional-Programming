package optional_Class;

import java.util.List;
import java.util.Optional;

public class Op {
    public static void main(String[] args) {
        
       List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

       Optional<Integer> result = numbers.stream()
        .reduce((a,b) ->a+b);

        if (result.isPresent()) {
            System.out.println(result.get());
        }else{
            System.out.println("List is Empty");
        }

    }
}
