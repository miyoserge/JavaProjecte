package klassen;

import java.util.Random;

public class MyTask implements Runnable {// Die Klasse Thread stellt ein parameterlos Konstruktor zur Verfügung.
	
	private boolean alive ;
	
	@Override
	public void run( ) {
	alive = true ;
	long start = System.currentTimeMillis() ;
		
		int bestMove = Integer.MIN_VALUE ;
		Random random = new Random() ;
		for(int i =1; i <= 100; i++) {
			for(int j =0; j < 2000; j++) {
				for(int k = 0; k < 2000; k++) {
					if( !alive) {
						System.out.println("Stopping!");
						return ;
					}
					
					int move = random.nextInt() ; // hier wird ei zufällige Zahl erzeugt.
					if(move > bestMove) {
						bestMove = move ; // Nacdem die drei For-Schleife durchgelaufen ist, steht in bestMove die höchste gefühlte Zahl
						
					}
				}
			}
			
			System.out.println("Thinking... " + i + "%");
			
		}
		
		long stop = System.currentTimeMillis()  ;
		long time = stop - start;
		System.out.println(Thread.currentThread().getName() + " FINISHED AFTER "  + time / 1000. + " seconds."  );
	}
	
	public void cancel() {
		alive = false ;
	}

}
