import java.util.Arrays;

public class ProductArr {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};


        System.out.println(Arrays.toString(getDivision(arr)));
        System.out.println(Arrays.toString(getWithoutDivision(arr)));


    }

    public static int[] getDivision(int[] arr) {
        int[] prod = new int[arr.length];
        int product = 1;
        for(int i = 0; i < arr.length; i++) {
            product = product * arr[i];
        }
        for(int i = 0; i < arr.length; i++) {
            prod[i] = product / arr[i];
        }
        return prod;
    }

    public static int[] getWithoutDivision(int[] arr){
        int n = arr.length;
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        int[] prod = new int[arr.length];
        left[0] = 1;
        right[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = arr[i - 1] * left[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = arr[i + 1] * right[i + 1];
        }
        for (int i = 0; i < n; i++) {
            prod[i] = left[i] * right[i];
        }
        return prod;
    }
}
