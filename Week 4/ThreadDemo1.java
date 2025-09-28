package thread;

class MyThread extends Thread {
	
	public void run() {
		// System.out.println("I am a thread");
		Thread t = Thread.currentThread();
		System.out.println(t);
	}
}

public class ThreadDemo1 {
	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		t.start(); // Creates a thread and invokes run()
		
		MyThread t1 = new MyThread();
		t1.start();
	}
}

/* Our work is only to push the threads (t,t1) in the runnable state, then for whichever thread CPU is going to
  allocate time, that is not in hands of programmer.
  
  First time I run the program:
  ----------------------------
  OUTPUT:
  Thread[#25,Thread-1,5,main]
  Thread[#24,Thread-0,5,main]
  
  Second time I run the program:
  -----------------------------
  OUTPUT:
  Thread[#25,Thread-1,5,main]
  Thread[#24,Thread-0,5,main]
  
  Third time I run the program:
  ----------------------------
  OUTPUT:
  Thread[#24,Thread-0,5,main]
  Thread[#25,Thread-1,5,main]
*/
