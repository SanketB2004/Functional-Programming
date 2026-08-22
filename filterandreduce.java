import java.util.List;
import java.util.function.Consumer;

public class filterandreduce {
    public static void main(String[] args) {
        
        List<String> fruts = List.of("Apple ", "Banana " , "Mango ","Cherry ","date ");

        System.out.println(fruts.size());

        for (String fruts2 : fruts) {
            System.out.print(fruts2);
        }System.out.println("Printing fruts using stream");

        /// used print stream 
        fruts.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s){
System.out.println(s);
            }
          /// used lambda
          
          
            

        });
        System.out.println("This is used to stram in lambda function");
    fruts.stream()
      .forEach(fruit -> System.out.println(fruit));
        }
}

// git remote add origin https://github.com/SanketB2004/Functional-Programming.git
// git branch -M main
// git push -u origin main