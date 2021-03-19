package proramme;

public class SynchedThreads1 implements Runnable {
	

	boolean alive ;
	long i ;
	
	public void run() {
		
		System.out.println("Threead starts....");
		i = 0 ;
		alive = true ;
		while (true ) {
			synchronized(this) {
			if(alive) {
			i++ ;
		} else {
			break ;
		}
			}
	}
		
System.out.println ("Thread ends.....") ;

	}
	
	public static void main(String[] args) {
		CrazyThreads1 c = new CrazyThreads1() ;
		new Thread(c).start();
		
		while(Thread.activeCount() > 1) {
			try {
			Thread.sleep(500);
			} catch ( InterruptedException e) {
				e.printStackTrace();
			}
			long iNow ;
			synchronized(c) {
			iNow = c.i ;
			}
			System.out.println(iNow);
			
			if(iNow >= LIMIT) {
				synchronized (c) {
				c.alive = false ;
				System.out.println("THREAD STOPPED! (alive = " + c.alive + ")");
				}
			}
		
		}
		System.out.println("Programm exits....");
	}
	private static final long LIMIT = 30000000000L; // 10 Milliarden

	
}
