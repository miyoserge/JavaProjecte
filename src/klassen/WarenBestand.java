package klassen;

import Interface.Verkaeuflich;

public class WarenBestand {
	
	private static Verkaeuflich[] waren = new Verkaeuflich[100] ;
	private static int counter = 0 ;
	
	
public static void hinzufuegen(Verkaeuflich v) {
		
		if (counter < waren.length) {
			waren[counter++] = v ;
		}
	}
	
	
		
	public static int getAnzahlWaren() {
		return counter;
	}
	
	
	public static int berechneGesamtEinnahmen() {
		
		int total = 0 ;
		for (Verkaeuflich v : waren) {
			if ( v == null) {
				break;
			}
			total += v.getPreis() ;
		}
		
		
		
		return total ;
		
	}



}
