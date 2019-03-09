package Consumer;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        // Print a string using consumer
        Consumer<String> printString = s -> System.out.println(s);
        printString.accept("Hello");

    }
}
