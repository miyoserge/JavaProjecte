package proramme;

public class SynchedThreads2 implements Runnable {
static  Object lock = new Object();
int x ;
	
	@Override
	public void run() {
		int i ;
		for(i = 0; i < 2000; i++) {
			synchronized(this) {
				x++ ;
			}
			
		}
System.out.println(Thread.currentThread().getName() + " has finished after " + i +"loops");
	}
	public static void main(String[] args) {
		CrazyThreads2 c = new CrazyThreads2() ;
		new Thread(c).start();
		new Thread(c).start();
		try {
		Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (lock) {
		System.out.println("x is: " + c.x);
	}
}
	
}
