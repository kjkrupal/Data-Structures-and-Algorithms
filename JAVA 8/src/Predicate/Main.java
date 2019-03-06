package Predicate;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        // Predicate to check number greter than 10 or not
        Predicate <Integer> greatTen = i -> i > 10;
        System.out.println(greatTen.test(100));
        System.out.println(greatTen.test(5));

        // Predicate to check string length greater than 5 or not
        Predicate <String> strGreatFive = s -> s.length() > 5;
        System.out.println(strGreatFive.test("krupal"));
        System.out.println(strGreatFive.test("nice"));
    }

}
