// Methods of Thread class

package thread;

class MyThread extends Thread {
	
	public void run() {
		// System.out.println("I am a thread");
		Thread t = Thread.currentThread();
		System.out.println(t); // Thread[#3,main,5,main]
		t.setName("MyThread");
		System.out.println(t); // Thread[#3,MyThread,5,main]
		System.out.println(t.getName()); // MyThread
		t.setPriority(8);
		/* 
		 If the priority is <1 or >10 then it will throw IllegalArgumentException 
		*/
		System.out.println(t); // Thread[#3,MyThread,8,main]
		System.out.println(t.getPriority()); // 8
	}
}

public class ThreadMethodsDemo {
	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		t.run();
	}
}

/* Thread[#3,main,5,main] 
   
   Thread number / id => #3
   Thread name => main
   Thread priority => 5
   Thread group (collection of threads) => main
   
   OUTPUT OF ABOVE CODE:
   --------------------
   Thread[#3,main,5,main]
   Thread[#3,MyThread,5,main]
   MyThread
   Thread[#3,MyThread,8,main]
   8
*/
