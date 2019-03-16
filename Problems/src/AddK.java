import java.util.Arrays;

public class AddK {

    public static void main(String[] args) {

        int arr[] = {10, 15, 3, 8};
        int k = 17;

        System.out.println(check(arr, k));


    }

    public static boolean check(int[] arr, int k) {

        int start = 0;
        int end = arr.length - 1;

        Arrays.sort(arr);

        while(end >= start){
            if(arr[start] + arr[end] == k){
                return true;
            }
            else if(arr[start] + arr[end] > k){
                end--;
            }
            else {
                start++;
            }
        }

        return false;
    }

}
