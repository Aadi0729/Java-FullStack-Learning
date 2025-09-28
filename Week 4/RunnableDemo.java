package thread;

class ThreadR implements Runnable {
	
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(i+" ");
		}
	}
}

public class RunnableDemo {
	public static void main(String[] args) {
		ThreadR t1 = new ThreadR();
		Thread t = new Thread(t1);
		t.start();
	}
}
