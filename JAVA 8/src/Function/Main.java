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

        // Function to get grade of student based on marks
        Function <Integer, Character> getGradeFunction = m -> m >= 80 ? 'A' : m >= 60 ? 'B' : m >= 40 ? 'C': 'F';
        System.out.println(getGradeFunction.apply(91));
        System.out.println(getGradeFunction.apply((26)));
        System.out.println(getGradeFunction.apply(69));

        Function <String, String> upperFunction = s -> s.toUpperCase();
        Function <String, String> firstNineFunction = s -> s.substring(0, 6);

        Function <Integer[], Integer>  sum = a -> a[0] + a[1];

        System.out.println(upperFunction.andThen(firstNineFunction).apply("krupaljadhav"));
        System.out.println(upperFunction.compose(firstNineFunction).apply("krupaljadhav"));

    }
}
