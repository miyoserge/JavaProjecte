package klassen;

import Interface.Verkaeuflich;

public abstract class Fahrzeug implements Verkaeuflich, Cloneable {// man kann keine Instanz und Objekt in einer abstrakte Klasse erzuegen
	
	
	public static final int DEFAULT_TUNEWERT = 50 ;
	public static int erstellteFahrzeug = 0; // Klassenvariablen existiert nur einmal im Programm.
	                                      // Instanzvariablen existiert für jedes Objekt.
	static {
		System.out.println("Die Fahrzeug-Klasse wurde initialisiert");
	}
	
	//Instanz-Variablen(Attribute, Member)
	 //<Datentyp> <Name> [ < Zuweisung>]
	private int leistung ;//  Datenkapselung: (Heiß wir verstärken Daten und erlauben wir keine direkte zugriff darauf)
	private String hersteller ; // Datenkapselung :(Heiß wir verstärken Daten und erlauben wir keine direkte zugriff darauf)
	private int preis;
	
	// Instanz-Methoden( Beschreibt die Fähigkeit eines Objekt)
	
	public void tunen(int tuneWert)  {
		if (tuneWert <= 0) {
			throw new TuneException("Der tuneWert darf nicht negativ sein");
		}
		leistung = leistung + tuneWert;
	}
	   
	
	 public void tunen(){
	 tunen(DEFAULT_TUNEWERT);
	 }
	 
	 
	// Getter:
	public int getLeistung() {
		return leistung;
	}
	
	public String getHersteller() {
		return hersteller;
	}
	
	public int getPreis() {
		return preis ;
	}
	
	// Setter:
	public void setLeistung(int neueLeistung) {
		
		/*
		 * Wir müssen noch den Wert neueLeistung überprüfen!
		 * Falls er negativ ist -> Reagiere darauf!
		 *
		 * */
				
		leistung = neueLeistung ;
		
	}
	
	public void setPreis(int preis) {
		this.preis = preis ;
	}
	
	public void setHersteller(String neuerHersteller) {
		hersteller = neuerHersteller ;
	}
	//Konstruktor(schließ die Initialisierung eines Objekt. )
	
	// Definition des Konstruktor:<Klassennamen> (Parameterliste) {Rumpf}
	
	 /*Konstruktor liefert objekt zurück.Wenn man ein Konstruktor aufruf
	 muss man ein Objekt zurück liefern*/
	

	 public Fahrzeug(int leistung, String hersteller, int preis){
		setLeistung(leistung);
		setPreis(preis) ;
		setHersteller( hersteller);
		erstellteFahrzeug = erstellteFahrzeug + 1 ;
	System.out.println("Es wurde soeben das  " + erstellteFahrzeug + ". Auto erstellt! "  ) ;
	
	}
	 
	
	public Fahrzeug(String Hersteller) {
		this(100, "Hersteller" , 0);
	}

	//Default-Konstruktor
	public Fahrzeug() {
		this(10, "" ,10);
	}
	public static void printInfos(Fahrzeug f) {
		System.out.println("Die Leistung ist:" + f.leistung);
		System.out.println("Der Hersteller ist:" + f.hersteller);
		
		
	}
	@Override // Es bedeutet der compiler überprüft, ob wir den toString Methoden überschreiben
	public String toString() {
		
	return "Die Leistung ist:  " + leistung 
			+ ", der Hersteller ist:" + hersteller ;
	}
	
	public abstract void crashTest();
	
	@Override
		public Fahrzeug clone() {
	Fahrzeug f = null ;
	try {
	f = (Fahrzeug)super.clone() ;
	} catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}
			return f ;
		}

}
