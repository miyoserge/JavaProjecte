package klassen;

public class LKW extends  Fahrzeug {
	
	public LKW(int leistung, String hersteller, int preis) {
		super(leistung,"hersteller",preis) ; // Aufruf der Konstruktor
	}

	
	public LKW() {
		super(10,"",10) ;
	}

	
	public String toString() {
		return super.toString() ;
	}
	
	
	public void crashTest() {
		 // To Do
	}

	
}
