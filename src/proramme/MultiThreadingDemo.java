package proramme;

import klassen.MyTask;

public class MultiThreadingDemo {
	public static void main(String[] args) {
		
	int threads = 5;
	
	for(int i = 1 ; i <= threads;i++) {
	 MyTask t = new MyTask()	;
	 Thread thread = new Thread(t) ;
	 thread.start();
	 
	}
		
		
	}

}
