package klassen;

public class Auto {// Klasse dienst dazu Objekte zu beschreiben
	public static final int DEFAULT_TUNEWERT = 50 ;
	public static int erstellteAutos = 0; // Klassenvariablen existiert nur einmal im Programm.
	                                      // Instanzvariablen existiert f�r jedes Objekt.
	static {
		System.out.println("Die Auto-Klasse wurde initialisiert");
	}
	
	//Instanz-Variablen(Attribute, Member)
	 //<Datentyp> <Name> [ < Zuweisung>]
	private int leistung ;//  Datenkapselung: (Hei� wir verst�rken Daten und erlauben wir keine direkte zugriff darauf)
	private String hersteller ; // Datenkapselung :(Hei� wir verst�rken Daten und erlauben wir keine direkte zugriff darauf)
	
	// Instanz-Methoden( Beschreibt die F�higkeit eines Objekt)
	
	public void tunen(int tuneWert) {
		leistung = leistung + tuneWert;
	}
	   
	public void tunen() {
		tunen(DEFAULT_TUNEWERT);
	}
	// Getter:
	public int getLeistung() {
		return leistung;
	}
	
	public String getHersteller() {
		return hersteller;
	}
	
	// Setter:
	public void setLeistung(int neueLeistung) {
		
		/*
		 * Wir m�ssen noch den Wert neueLeistung �berpr�fen!
		 * Falls er negativ ist -> Reagiere darauf!
		 *
		 * */
		boolean positiv = leistung > 0 ;
		if(positiv) {
			this.leistung = leistung ;
		} else {
			System.out.println("Ung�ltiger Wert f�r die Leistung - Programm wird beendet");
			System.exit(-1);
		}
		
		leistung = neueLeistung ;
		
	}
	
	public void setHersteller(String neuerHersteller) {
		hersteller = neuerHersteller ;
	}
	//Konstruktor(schlie� die Initialisierung eines Objekt. )
	
	// Definition des Konstruktor:<Klassennamen> (Parameterliste) {Rumpf}
	
	 /*Konstruktor liefert objekt zur�ck.Wenn man ein Konstruktor aufruf
	 muss man ein Objekt zur�ck liefern*/
	 public Auto(int dieLeistung, String derHersteller){
		setLeistung(dieLeistung);
		setHersteller( derHersteller);
		erstellteAutos = erstellteAutos + 1 ;
	System.out.println("Es wurde soeben das  " + erstellteAutos + ". Auto erstellt! "  ) ;
	
	}
	 
	
	public Auto(String Hersteller) {
		this(100, "Hersteller");
	}

	public static void printInfos(Auto auto) {
		System.out.println("Die Leistung ist:" + auto.leistung);
		System.out.println("Der Hersteller ist:" + auto.hersteller);
		
		
	}
	
}
