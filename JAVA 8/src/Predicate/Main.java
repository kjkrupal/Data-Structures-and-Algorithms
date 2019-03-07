package Predicate;

import java.util.*;
import java.util.function.Predicate;

public class Main {

    static List list = Arrays.asList(new int[]{1,2,3});

    public static void main(String[] args) {

        String[] names = {"krupal", "tanvi", "", "sheryl", null, "bhavesh", null, "", "hitesh"};

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

        // Predicate to remove null and empty string from string array
        Predicate <String> emptyStringPredicate = s -> s != null && s.length() != 0;
        ArrayList <String> nameList = new ArrayList<>();
        for(String s: names){
            if(emptyStringPredicate.test(s))
                nameList.add(s);
        }
        System.out.println("Proper strings are: " + nameList);

        // Predicate for user authentication
        Predicate <User> userAuthPredicate = user -> user.username.equals("krupal") && user.password.equals("kjpwd");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();
        User user = new User(username, password);
        System.out.println("User authorized? " + userAuthPredicate.test(user));
    }

}
