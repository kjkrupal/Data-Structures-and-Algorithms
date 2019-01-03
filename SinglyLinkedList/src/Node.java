public class Node {

    private Student student_data;
    private Node next;

    public Node(Student student_data, Node next) {
        this.student_data = student_data;
        this.next = next;
    }

    public Student getStudent_data() {
        return student_data;
    }

    public void setStudent_data(Student student_data) {
        this.student_data = student_data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
