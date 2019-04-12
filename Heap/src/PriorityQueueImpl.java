import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueImpl {
    public static void main(String[] args) {

        PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int[] arr = new int[] {56, 78, 2, 49, 101, 1, 106};

        for(int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(pq.poll());
        }
    }
}
