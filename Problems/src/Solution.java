import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@FunctionalInterface
interface A {

    default void m1() {
        System.out.println("M1 Default");
    }

    static void m2() {
        System.out.println("M2 Static");
    }

    void m3(int x);
}

class Solution  {

    public static void main(String[] args) {

        A a = Solution::method;

        A b = x -> System.out.println("BHADWE " + x);

        a.m3(7);
        b.m3(10);

    }

    public void m1(int x) {
        System.out.println("Solution M1");
    }

    public static void method(int x) {
        System.out.println("LAUDE " + x);
    }

}