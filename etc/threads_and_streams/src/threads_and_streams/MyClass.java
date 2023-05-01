package threads_and_streams;

public class MyClass {
    private long c1 = 0;
    private long c2 = 0;
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void inc1() {
        synchronized(lock1) {
            c1++;
            //might be 3 different statements in (java asm):
            //1.grab c1 from memory - read
            //2.adding 1 to current value of c1 - adding 1 to c1 
            //3.write new c1 value into memory - write 
            
        }
    }
    public void dec1() {
    	synchronized(lock1) {
    		c1--;
    	}
    }

//    public void inc2() {
//        synchronized(lock2) {
//            c2++;
//        }
//    }
}

//thread a trys inc1 and inside that method 
// checks a  variable;
//if true or certain value, it calls the same method