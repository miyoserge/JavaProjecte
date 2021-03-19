package klassen;

public class TuneException extends RuntimeException{

	public TuneException() {
		
	}
	
	
public TuneException(String msg) {
		super(msg) ;
	}

public TuneException(Throwable t) {
	super(t);
}
	
public TuneException(String msg, Throwable t) {
super(msg, t)	 ;
}

	
}
