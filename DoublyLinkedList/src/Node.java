public class Node {

    private Student student_data;
    private Node next;
    private Node previous;

    public Node(Student student_data, Node next, Node previous) {
        this.student_data = student_data;
        this.next = next;
        this.previous = previous;
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

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
