public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public void addToFront(Student student){

        Node node = new Node(student, null, null);

        if(head == null){
            head = node;
            tail = node;
        }
        else{
            head.setPrevious(node);
            node.setNext(head);
            head = node;
        }

        size ++;
    }

    public void addFromBehind(Student student){

        Node node = new Node(student, null, null);

        if(head == null){
            head = node;
            tail = node;
        }
        else{
            tail.setNext(node);
            node.setPrevious(tail);
            tail = node;
        }

        size ++;
    }

    public void deleteFromFront(){
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            head = head.getNext();
            head.setPrevious(null);
            size --;
        }
    }

    public void deleteFromBehind(){
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            tail = tail.getPrevious();
            tail.setNext(null);
            size --;
        }
    }

    public void traverseFromFront(){

        Node temp = head;

        while(temp != null){
            System.out.println(temp.getStudent_data());
            temp = temp.getNext();
        }

    }

    public void traverseFromBehind(){

        Node temp = tail;

        while(temp != null){
            System.out.println(temp.getStudent_data());
            temp = temp.getPrevious();
        }

    }

    public int size(){
        return size;
    }

}
