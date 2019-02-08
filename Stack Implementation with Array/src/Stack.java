import java.util.Arrays;

public class Stack {

    private Student[] stack;
    private int top;

    public Stack() {
        this.stack = new Student[1];
        this.top = -1;
    }

    public void push(Student student){
        if(this.top == stack.length - 1) {
            Student[] array = new Student[2 * stack.length];
            System.arraycopy(stack, 0, array, 0, stack.length);
            stack = array;
        }
        top++;
        stack[top] = student;

    }

    public Student pop(){

        Student student = stack[top];
        stack[top] = null;
        top--;
        return student;
    }

    public Student peek(){
        return stack[top];
    }

    public boolean isEmpty(){
        return this.top == -1;
    }

    public int size(){
        return this.top + 1;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "stack=" + Arrays.toString(stack) +
                '}';
    }
}
