package klassen;

public class Motorrad extends Fahrzeug{

	public Motorrad(int leistung, String hersteller, int preis) {
		super(leistung,"hersteller",preis) ; // Aufruf der Konstruktor
	}
	
	
	public Motorrad() {
		super(10, "", 10);
	}
	
	
	public void crashTest() {
		 // To Do
	}

}
