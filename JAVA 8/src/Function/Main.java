package Function;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        String name = "Krupal Jadhav       Mumbai";

        // Function to get length of string
        Function<String, Integer> stringLengthFunction = s -> s.length();
        System.out.println(stringLengthFunction.apply("krupal"));
        System.out.println(stringLengthFunction.apply("I love JAVA"));

        // Function to get square of number
        Function <Integer, Integer> intSquareFunction = i -> i * i;
        System.out.println(intSquareFunction.apply(10));
        System.out.println(intSquareFunction.apply(27));

        // Function to remove string spaces
        Function <String, String> removeSpaceFunction = s -> s.replaceAll(" ", "");
        System.out.println(removeSpaceFunction.apply(name));

        // Function to get number of spaces in string
        Function <String, Integer> getSpaceCountFunction = s -> s.length() - s.replaceAll(" ", "").length();
        System.out.println(getSpaceCountFunction.apply(name));
    }
}
