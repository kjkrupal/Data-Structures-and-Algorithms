package Function;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        // Fuction to get length of string
        Function<String, Integer> stringLengthFunction = s -> s.length();
        System.out.println(stringLengthFunction.apply("krupal"));
        System.out.println(stringLengthFunction.apply("I love JAVA"));

    }
}
