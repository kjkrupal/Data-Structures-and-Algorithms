public class Implementation {
    public static void main(String[] args) throws Exception{

        int[] arr = {27, 2, 48, 19, 13, 45, 61, 30, 76, 4};
        MaxHeap heap = new MaxHeap();

        for(int i = 0; i < arr.length; i++){
            heap.add(arr[i]);
        }

        System.out.println(heap.getHeap());
        System.out.println(heap.extractMax());
        System.out.println(heap.getHeap());
        System.out.println(heap.extractMax());
        System.out.println(heap.getHeap());
        System.out.println(heap.extractMax());
        System.out.println(heap.getHeap());
        System.out.println(heap.extractMax());
        System.out.println(heap.getHeap());
        System.out.println(heap.extractMax());
        System.out.println(heap.getHeap());
        System.out.println(heap.extractMax());
        System.out.println(heap.getHeap());
        System.out.println(heap.extractMax());
        System.out.println(heap.getHeap());
        System.out.println(heap.extractMax());
        System.out.println(heap.getHeap());

    }
}
