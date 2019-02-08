import java.util.Arrays;

public class LinkedStack {

    private Node top;
    private Node stack;
    private int size;

    public LinkedStack() {

    }

    public void push(Student student){
        Node node = new Node(student, null);
        if(stack == null)
            stack = node;
        else
            node.setNext(top);
        top = node;

    }

    public Student pop(){
        Student student = top.getStudent_data();
        top = top.getNext();
        return student;
    }

    public Student peek(){
        return top.getStudent_data();
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return this.size;
    }

    public void printStack(){
        Node temp = top;
        while(temp != null){
            System.out.println(temp.getStudent_data());
            temp = temp.getNext();
        }
    }


}
