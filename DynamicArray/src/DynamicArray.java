import java.lang.reflect.Array;
import java.util.Arrays;

public class DynamicArray <T> {

    Object [] data;

    int size;

    public DynamicArray (int size) {
        this.size = 0;
        data = new Object[size];
    }

    public void put(Object element){
        ensureCapacity();
        data[size++] = (T) element;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public int getSize(){
        return data.length;
    }

    private void ensureCapacity(){

        if(size == data.length){
            data = Arrays.copyOf(data, data.length * 2);
        }
    }

}
