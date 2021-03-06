package Supplier;

import java.util.Date;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        // Get system date using supplier
        Supplier <Date> getDate = () -> new Date();
        System.out.println(getDate.get());

        // Supplier to get random name from array
        Supplier <String> getName = () -> {
            String [] names = {"Krupal", "Tanvi", "Ritika", "Radhika", "Bhavesh"};
            int i = (int) Math.floor(Math.random() * names.length);
            return names[i];
        };

        System.out.println(getName.get());

        // Supplier to generate OTP of length 6
        Supplier <Integer> getOTP = () -> (int) Math.floor(Math.random() * 1000000);
        System.out.println(getOTP.get());
    }
}
