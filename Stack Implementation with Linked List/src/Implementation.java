public class Implementation {
    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        stack.push(new Student("Krupal", 11599514));
        stack.push(new Student("Krupal1", 11599515));
        stack.push(new Student("Krupal2", 11599516));
        stack.push(new Student("Krupal3", 11599517));
        stack.push(new Student("Krupal4", 11599518));

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.printStack();
    }

}
