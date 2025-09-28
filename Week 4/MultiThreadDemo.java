package thread;

class ThreadX extends Thread {
	
	public void run() {
		
		Thread t = Thread.currentThread();
		t.setName("ThreadX");
	
		for(int i=1; i<=10; i++) {
			System.out.println(t.getName()+":"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadY extends Thread {
	
	public void run() {
		
		Thread t = Thread.currentThread();
		t.setName("ThreadY");
		
		for(int i=10; i>=1; i--) {
			System.out.println(t.getName()+":"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreadDemo {
	public static void main(String[] args) {
		
		ThreadX t = new ThreadX();
		t.start();
		// t.start(); // IllegalThreadStateException
		
		ThreadY t1 = new ThreadY();
		t1.start();
	}
}

/*
  sleep()
  ------- 
  When sleep() is invoked on a thread, the current thread will goto block state for the given interval of time 
  Ex: Thread.sleep(1000); //1000 milliseconds (1 second) 
  
  Note
  ---- 
  When start() is invoked on a thread multiple times then it throws "IllegalThreadStateException"
 */
