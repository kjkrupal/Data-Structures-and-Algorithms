package Consumer;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        // Print a string using consumer
        Consumer <String> printString = s -> System.out.println(s);
        printString.accept("Hello");

        // Consumer chaining demo
        Consumer <String> c1 = s -> System.out.println("Hey its starting");
        Consumer <String> c2 = s -> System.out.println(s);
        Consumer <String> c3 = s -> System.out.println("It ended");

        c1.andThen(c2).andThen(c3).accept("Consumer chaining");


    }
}
