public class Node {
    int vertex;
    Node left;
    Node right;
    static int size;

    Node(int vertex){
        this.vertex = vertex;
        size++;
    }

    int getSize(){
        return size;
    }

    @Override
    public String toString() {
        return "Vertex = " + vertex;
    }
}
