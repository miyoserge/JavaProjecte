package klassen;

public class PKW extends Fahrzeug{// PKW ist die Kindklasse von Fahrzeug, oder PKW leitet die Klasse Fahrzeug ab.
	
	
	{
		tunen(100) ;
	}
	private int anzahlTueren;
	
	public void setAnzahlTueren(int anzahlTueren) {
		this.anzahlTueren = anzahlTueren;
	}
	
	public int getAnzahlTueren() {
		return anzahlTueren ;
	}

	public PKW(int leistung, String hersteller, int preis, int anzahlTueren) {
		super(leistung,"hersteller",preis) ; // Aufruf der Konstruktor
		                                  // Super dienst dazu auf Sache der VaterKalsse zuzugreifen.
		setAnzahlTueren(anzahlTueren) ;
	}
	
	public PKW() {
		super(10,"hersteller", 10) ;
	}
	
	public String toString() {
		return super.toString() +", Anzahl Türen:" +anzahlTueren  ;
	}
	
	public void crashTest() {
		 // To Do
	}
	
	public int hashCode() {
		return getLeistung() + new Integer( 11*anzahlTueren).hashCode() + getHersteller().hashCode() ;
	}
}
