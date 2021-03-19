package klassen.pcp;

public class Pipeline {
	private Object data = null ;
	
	public synchronized void put(Object newData) {
		System.out.println("Producer  " +Thread.currentThread().getName() + 
				" entered put ()...");
		
		while (data != null) {
			try {
			wait();// busy waiting
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		data = newData;
		System.out.println("Producer  " +Thread.currentThread().getName() + 
				" put data: " + data);
		}
	
 
	public synchronized Object get() {
		System.out.println("Consumer entered get()....");
		while(data == null) {
		
			try {
				wait();// busy waiting
				} catch(InterruptedException e) {
					e.printStackTrace();
				}	; //busy waiting
		}
		Object theData = data ;
		data = null;
		System.out.println("Consumer retrieved data:  " +theData);
			
	
		return theData ;
	}
  
}
