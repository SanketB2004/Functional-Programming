package lambda;

/**
 * lamda1
 */
public class lambda1 {

    public static void main(String[] args) {
        lambda1 test = new lambda1();
        int sum = test.sum(5, 10);
        test.printString("This is the best course");

        // toPrint -> System.out.println(toPrint);
        
        // (a , b) -> a+b;

        //  (a,b)-> {int sum = a+b ;
        //     System.out.println(sum)};
    } 

    public void printString(String toPrint){
        System.out.println(toPrint);
    }

    public int sum(int a , int b){
        int sum = a+b;
        return sum;
    }
    
}