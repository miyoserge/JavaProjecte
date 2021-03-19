package proramme;

public class SynchedThreads3 implements Runnable{

int x ;
	
	public void run() {
		int loops = 0 ;
		
		while(true) {
			synchronized(this) {
			if( x < 10000) {
				x++ ; //x = x + 1
				loops++;
			} else {
				break ;
			}
		}
		}
	System.out.println( Thread.currentThread().getName() + " has finished after " + loops + "loops");
		
	}
	
	public static void main(String[] args) {
		CrazyThreads3 a = new CrazyThreads3() ;
		new Thread(a).start();
		new Thread(a).start();
		
		try {
		Thread.sleep(500);
		} catch( InterruptedException e) {
			e.printStackTrace();
		}
		synchronized(a) {
		System.out.println("x = " + a.x);
		}
	}

}
