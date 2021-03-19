package klassen.pcp;

public class Consumer implements Runnable {
	private final Pipeline pipeline;

	public Consumer(Pipeline pipeline) {
		this.pipeline = pipeline ;
	}

	@Override
	public void run() {
		
		while(true) {
			System.out.println("Consumer wants to enter get() ...");
			pipeline.get() ;
			
			
			try {
				Thread.sleep( (long) (Math.random() * 2000));
				} catch( InterruptedException e) {
					e.printStackTrace();
				}
			
		}
		
	}
	
}
