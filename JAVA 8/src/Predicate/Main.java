package Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    static List list = Arrays.asList(new int[]{1,2,3});

    public static void main(String[] args) {

        // Predicate to check number greter than 10 or not
        Predicate <Integer> greatTen = i -> i > 10;
        System.out.println(greatTen.test(100));
        System.out.println(greatTen.test(5));

        // Predicate to check string length greater than 5 or not
        Predicate <String> strGreatFive = s -> s.length() > 5;
        System.out.println(strGreatFive.test("krupal"));
        System.out.println(strGreatFive.test("nice"));

        // Predicate to check collection is empty or not
        Predicate <Collection> collectionIsEmpty = c -> c.isEmpty();
        System.out.println(collectionIsEmpty.test(list));
    }

}
