package threads_and_streams;

public class SynchronizedCounter {
    private int c = 0;
    //private String str = "hi";

    public synchronized void increment() {
        c++;
        // c= 0 //theread a 
        //threadA c =1// tthreadb c = 0
        //c == 1
    }

    public synchronized void decrement() {
        c--;
        return;
    }

    public synchronized int value() {
        return c;
    }
}