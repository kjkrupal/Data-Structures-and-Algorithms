package Supplier;

import java.util.Date;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        // Get system date using supplier
        Supplier <Date> getDate = () -> new Date();
        System.out.println(getDate.get());
    }
}
