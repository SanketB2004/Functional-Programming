import java.util.List;
import java.util.function.Consumer;

public class filterandreduce {
    public static void main(String[] args) {
        
        List<String> fruts = List.of("Apple ", "Banana " , "Mango ","Cherry ","date ");

        System.out.println(fruts.size());

        for (String fruts2 : fruts) {
            System.out.print(fruts2);
        }System.out.println("Printing fruts using stream");
        fruts.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s){
System.out.println(s);
            }
        });
    }
}
