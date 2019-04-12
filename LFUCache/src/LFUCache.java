import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class LFUCache {

    int capacity;
    PriorityQueue<Node> pq;
    Map<Integer, Node> table;

    private class Node{
        int key;
        int value;
        int access;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public LFUCache(int capacity) {
        this.capacity = capacity;
        pq = new PriorityQueue<>(new Comparator() {
            @Override
            public int compare(Object n1, Object n2) {
                int q1 =  ((Node) n1).access;
                int q2 =  ((Node) n2).access;
                return q1 < q2 ? -1 : q1 > q2 ? 1 : 0;
            }
        });
        table = new HashMap<>();
    }

    public int get(int key) {
        Node node = table.get(key);
        if(node == null)
            return -1;

        pq.remove(node);
        node.access++;
        pq.add(node);
        return node.value;
    }

    public void put(int key, int value) {

        System.out.println(pq.size());

        if(pq.size() == capacity)
            return;

        if(table.get(key) == null) {
            Node node = new Node(key, value);
            node.access++;
            table.put(key, node);

            if(capacity == pq.size()) {
                table.remove(pq.poll().key);
            }

            pq.add(node);

        }
        else {
            Node node = table.get(key);
            pq.remove(node);
            node.access++;
            node.value = value;
            pq.add(node);
        }

    }
}
