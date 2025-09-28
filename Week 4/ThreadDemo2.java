package thread;

class MyThread extends Thread {
	
	public void run() {
		// System.out.println("I am a thread");
		Thread t = Thread.currentThread();
		System.out.println(t);
	}
}

public class ThreadDemo2 {
	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		t.run();
	}
}

/* That's not a MultiThread program. When we run the program, the first thread which it creates is "main".
 
   OUTPUT:
   Thread[#3,main,5,main]
   
   Until the run() method is not completed, it won't come out of it. So its a ordinary program.
   
   Thread can only be created through start(). Without start() there is no concept of thread.
*/
