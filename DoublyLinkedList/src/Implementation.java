public class Implementation {

    public static void main(String[] args) {

        Student krupal = new Student("Krupal", 11599514);
        Student deepesh = new Student("Deepesh", 11599515);
        Student bhavesh = new Student("Bhavesh", 11599516);
        Student priyank = new Student("Priyank", 11599517);
        Student dharmil = new Student("Dharmil", 11599518);

        DoublyLinkedList lista = new DoublyLinkedList();
        lista.addToFront(krupal);
        lista.addToFront(dharmil);
        lista.addToFront(deepesh);


        DoublyLinkedList listb = new DoublyLinkedList();
        listb.addFromBehind(bhavesh);
        listb.addFromBehind(dharmil);
        listb.addFromBehind(priyank);

        DoublyLinkedList list = new DoublyLinkedList();
        list.addFromBehind(bhavesh);
        list.addFromBehind(dharmil);
        list.addFromBehind(priyank);
        list.addFromBehind(deepesh);

        list.addBefore(priyank, krupal);

        list.traverseFromFront();


    }

}
