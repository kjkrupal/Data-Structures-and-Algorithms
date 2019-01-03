public class SinglyLinkedList {

    private Node head;
    private int size;

    public void addToFront(Student student){

        Node node = new Node(student, null);

        if(head == null){
            node.setNext(null);
        }
        else{
            node.setNext(head);
        }
        head = node;

        size ++;
    }

    public void deleteFromFront(){

        if(head == null){
            System.out.println("List is empty");
        }
        else{
            head = head.getNext();
            size --;
            System.out.println("Deleted. Current size is " + size);
        }

    }

    public void traverse(){

        Node temp = head;

        while(temp != null){
            System.out.println(temp.getStudent_data());
            temp = temp.getNext();
        }

    }

    public int size(){
        return size;
    }

}
