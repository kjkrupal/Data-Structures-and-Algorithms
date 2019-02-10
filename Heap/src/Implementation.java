public class Implementation {
    public static void main(String[] args) {

        MaxHeap heap = new MaxHeap();

        for(int i = 0; i < 10; i++){
            System.out.println("Right child of " + (i + 1) + " is " + (heap.rightChild(i) + 1));
        }

    }
}
