public class MaxHeap {

    private int[] heap;
    int size;

    public void shiftUp(int i){
        while(heap[parent(i)] < heap[i] && i > 0){
            swap(parent(i), i);
            i = parent(i);
        }
    }

    public void shiftDown(int i){
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

    public int parent(int i){
        return (i - 1) / 2;
    }

    public int leftChild(int i){
        return 2 * i + 1;
    }

    public int rightChild(int i){
        return 2 * i + 2;
    }

    public void swap(int i, int j){
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

}
