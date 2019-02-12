public class Implementation {
    public static void main(String[] args) {

        int[] arr = {27, 2, 48, 19, 13, 45, 61, 30, 76, 4};
        MaxHeap heap = new MaxHeap();

        for(int i = 0; i < arr.length; i++){
            heap.add(arr[i]);
        }

        int[] heap_arr = heap.get();

        for(int i = 0; i < heap_arr.length; i++){
            System.out.print(heap_arr[i] + " ");
        }

    }
}
