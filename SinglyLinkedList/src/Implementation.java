public class Implementation {

    public static void main(String[] args) {

        Implementation implementation = new Implementation();

        Student krupal = new Student("Krupal", 11599514);
        Student deepesh = new Student("Deepesh", 11599515);
        Student bhavesh = new Student("Bhavesh", 11599516);
        Student priyank = new Student("Priyank", 11599517);
        Student dharmil = new Student("Dharmil", 11599518);
        Student sheryl = new Student("Sheryl", 11599519);

        SinglyLinkedList list1 = new SinglyLinkedList();
        SinglyLinkedList list2 = new SinglyLinkedList();

        list1.addToFront(krupal);
        list1.addToFront(deepesh);
        list1.addToFront(bhavesh);
        list2.addToFront(priyank);
        list2.addToFront(dharmil);
        list2.addToFront(sheryl);

        SinglyLinkedList combined = implementation.combineTwoList(list1, list2);

        combined.traverse();

    }

    public SinglyLinkedList combineTwoList(SinglyLinkedList list1, SinglyLinkedList list2){

        SinglyLinkedList combined = new SinglyLinkedList();



        return combined;
    }

}
