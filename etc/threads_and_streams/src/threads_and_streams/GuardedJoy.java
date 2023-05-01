package threads_and_streams;

public class GuardedJoy {

	
	private static boolean joy = false;
	
	
	
	public static void guardedJoy() {
	    // Simple loop guard.
//
//	Wastes
//	    // processor time.

	// Don't do this!
	    while(!joy) {
	    System.out.println("Joy has been achieved!");
	}
	}
	
	
	public static void main(String[] args ) {
        new Thread(() -> {
			guardedJoy();
		}, "T1").start();
        new Thread(() -> {
			try {
				operation2();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}, "T2").start();
	}
	
	public static void operation2() throws InterruptedException {
        
	Thread.sleep(50);
	      System.out.println("executing second operation.");
	
}
}