package thread;

class ThreadSum extends Thread {
	int sum;
	public void run() {
		for(int n=1;n<=100;n++)
			sum = sum + n;
		
		synchronized(this) {
			notify();
		}
    }
}

public class InterThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		ThreadSum ts = new ThreadSum();
		ts.start();
		
		synchronized(ts) {
			ts.wait();
		}
		
		System.out.println("Sum = "+ts.sum);
    }
}
//Runnable State => main thread, ts thread
