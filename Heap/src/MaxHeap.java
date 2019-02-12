import java.util.Arrays;

public class MaxHeap {

    private int[] heap;
    int size;
    int maxSize;

    public MaxHeap(){
        heap = new int[10];
        this.maxSize = 10;
    }

    public MaxHeap(int initialCapacity){
        heap = new int[initialCapacity];
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
        return 2 * i + 1;
    }

    private int rightChild(int i){
        return 2 * i + 2;
    }

    private void swap(int i, int j){
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void add(int element) {
        if(size == maxSize - 1){
            heap = Arrays.copyOf(heap, heap.length * 2);
        }
        heap[size] = element;
        shiftUp(size);
        size++;
    }


    public int[] get(){
        return heap;
    }

}
