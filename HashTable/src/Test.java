import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}

class MyThread extends Thread{

    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("Child thread");
        }
    }

    //hya class madhe start ahe but it is invisible
}