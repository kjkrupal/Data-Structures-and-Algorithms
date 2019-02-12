import java.util.Arrays;

public class MaxHeap {

    private int[] heap;
    private int size;
    private int maxSize;

    public MaxHeap(){
        heap = new int[10];
        this.maxSize = 10;
    }

    public MaxHeap(int initialCapacity){
        heap = new int[initialCapacity];
        this.maxSize = initialCapacity;
    }

    private void shiftUp(int i){
        while(heap[parent(i)] < heap[i] && i > 0){
            swap(parent(i), i);
            i = parent(i);
        }
    }

    private void shiftDown(int i){
        int maxIndex = i;
        int l = leftChild(i);
        if(l <= size && heap[l] > heap[maxIndex]){
            maxIndex = l;
        }
        int r = rightChild(i);
        if(r <= size && heap[r] > heap[maxIndex]){
            maxIndex = r;
        }
        if(i != maxIndex){
            swap(i, maxIndex);
            shiftDown(maxIndex);
        }
    }

    private int parent(int i){
        return (i - 1) / 2;
    }

    private int leftChild(int i){
        return (2 * i) + 1;
    }

    private int rightChild(int i){
        return (2 * i) + 2;
    }

    private void swap(int i, int j){
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void add(int element) {
        if(size == maxSize){
            heap = Arrays.copyOf(heap, heap.length * 2);
            this.maxSize *= 2;
        }
        heap[size] = element;
        shiftUp(size);
        size++;
    }


    public String getHeap(){
        return Arrays.toString(Arrays.copyOfRange(heap, 0, size));
    }

    public int extractMax() throws EmptyHeapException{
        if(size == 0){
            throw new EmptyHeapException();
        }
        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        shiftDown(0);
        return max;
    }

}
