import java.util.Arrays;

public class Implementation {
    public static void main(String[] args) throws Exception{

        int[] arr = {27, 2, 48, 19, 13, 45, 61, 30, 76, 4};

        //Build heap by manually inserting element
        MaxHeap heap = new MaxHeap();

        for(int i = 0; i < arr.length; i++){
            heap.add(arr[i]);
        }

        System.out.println(heap.toString() + "\n");
        System.out.println(heap.extractMax());
        System.out.println(heap.toString() + "\n");
        System.out.println(heap.extractMax());
        System.out.println(heap.toString() + "\n");
        System.out.println(heap.extractMax());
        System.out.println(heap.toString() + "\n");
        System.out.println(heap.extractMax());
        System.out.println(heap.toString() + "\n");
        System.out.println(heap.extractMax());
        System.out.println(heap.toString() + "\n");
        System.out.println(heap.extractMax());
        System.out.println(heap.toString() + "\n");
        System.out.println(heap.extractMax());
        System.out.println(heap.toString() + "\n");
        System.out.println(heap.extractMax());
        System.out.println(heap.toString() + "\n");

        //Build heap from an array
        MaxHeap heap_arr = new MaxHeap(arr);

        System.out.println(Arrays.toString(heap_arr.sort()));

    }
}
