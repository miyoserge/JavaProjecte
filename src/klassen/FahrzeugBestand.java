package klassen;

public class FahrzeugBestand {
	
	private static Fahrzeug[] fahrzeuge = new Fahrzeug[100] ;
	private static int fCounter = 0 ;
	/*
	private static PKW[] pkws = new PKW[100] ;
	private static LKW[] lkws = new LKW[100] ;
	private static Motorrad[] motorrader  = new Motorrad[100] ;
	
	private static int pkwCounter = 0;
	private static int lkwCounter = 0;
	private static int motorradCounter = 0;
	*/
	public static void hinzufuegen(Fahrzeug f) {
		
		if (fCounter < fahrzeuge.length) {
			fahrzeuge[fCounter++] = f ;
		}
	}
	
	
	public static int getAnzahlPKWs() {
		int anzahl = 0 ;
		
		for(Fahrzeug f : fahrzeuge) {
			if (f instanceof PKW) {
				anzahl++;
			}
		}
		return anzahl ;
		
	}
	
	/*
public static void hinzufuegen(LKW lkw)	{
	
	if (lkwCounter < lkws.length) {
		lkws[lkwCounter++] = lkw ;
	}

	
}



public static void hinzufuegen(Motorrad m)	{
	
	if (motorradCounter < motorrader.length) {
		motorrader[motorradCounter++] = m ;
	}
	
  }
*/

public static int getAnzahlFahrzeuge() {
	return fCounter;
}


public static int berechneGesamtEinnahmen() {
	
	int total = 0 ;
	for (Fahrzeug f : fahrzeuge) {
		if ( f == null) {
			break;
		}
		total += f.getPreis() ;
	}
	
	/*
	for(LKW lkw : lkws) {
		
		if(lkw == null) {
			break ;
		}
		total += lkw.getPreis() ;
	}
	
	for (Motorrad m : motorrader) {
		
		if(m == null) {
			break;
		}
		total += m.getPreis() ;
	}
	*/
	
	return total ;
	
}


















}
