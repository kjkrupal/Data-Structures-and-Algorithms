import java.util.LinkedList;

public class HashTable {

    LinkedList[] data;

    public HashTable(int size){
        data = new LinkedList[size];
    }

    public void put(String key, Object o){
        int hash = key.hashCode() & 0xfffffff;
        int index = getIndex(hash);
        if(data[index] == null){
            data[index] = new LinkedList();
        }
        data[index].push(o);
    }

    public Object get(String key){
        int hash = key.hashCode() & 0xfffffff;
        int index = getIndex(hash);

        if(data[index] == null){
            return "Key not present";
        }
        if(data[index].size() > 1){

        }

        return data[index];
    }

    public int getIndex(int hash){
        return hash % data.length;
    }


}
