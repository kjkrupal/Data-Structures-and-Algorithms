public class Implementation {

    public static void main(String[] args) {

        Student krupal = new Student("Krupal", 11599514);
        Student deepesh = new Student("Deepesh", 11599515);
        Student bhavesh = new Student("Bhavesh", 11599516);
        Student priyank = new Student("Priyank", 11599517);
        Student dharmil = new Student("Dharmil", 11599518);

        SinglyLinkedList list = new SinglyLinkedList();

        list.addToFront(krupal);
        list.addToFront(deepesh);
        list.addToFront(bhavesh);
        list.addToFront(priyank);
        list.addToFront(dharmil);

        list.traverse();

        list.deleteFromFront();

        list.traverse();

    }

}
