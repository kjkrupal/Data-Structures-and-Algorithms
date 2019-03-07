package Function;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        // Function to get length of string
        Function<String, Integer> stringLengthFunction = s -> s.length();
        System.out.println(stringLengthFunction.apply("krupal"));
        System.out.println(stringLengthFunction.apply("I love JAVA"));

        // Function to get square of number
        Function <Integer, Integer> intSquareFunction = i -> i * i;
        System.out.println(intSquareFunction.apply(10));
        System.out.println(intSquareFunction.apply(27));
    }
}
