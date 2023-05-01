package threads_and_streams;

public class HelloRunnable extends Fruit implements Runnable {

    public void run() {
        System.out.println("Hello from a thread!");
        //squishMe();
    }

    public static void main(String args[]) {
        (new Thread(new HelloRunnable())).start();
        (new HelloThread()).start();

    }


}