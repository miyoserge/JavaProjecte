package proramme;

import klassen.FahrzeugBestand;
import klassen.LKW;
import klassen.Motorrad;
import klassen.PKW;

public class FahrzeugBestandDemo {
	public static void main(String[] args) {
		
		PKW pkw1 = new PKW()	;
		pkw1.setPreis(14900);
		
		PKW pkw2 = new PKW() ;
		pkw2.setPreis(39900);
		
		PKW pkw3 = new PKW();
		pkw3.setPreis(75000);
		
		
		Motorrad m1 = new Motorrad() ;
		m1.setPreis(6800);
		
		Motorrad m2 = new Motorrad();
		m2.setPreis(11000);
		
		
		
		LKW lkw1 = new LKW() ; 
		lkw1.setPreis(89900);
		
		LKW lkw2 = new LKW();
		lkw2.setPreis(114000);
		
		
		
		FahrzeugBestand.hinzufuegen(pkw1);
		FahrzeugBestand.hinzufuegen(pkw2);
		FahrzeugBestand.hinzufuegen(pkw3);
		FahrzeugBestand.hinzufuegen(m1);
		FahrzeugBestand.hinzufuegen(m2);
		FahrzeugBestand.hinzufuegen(lkw1);
		FahrzeugBestand.hinzufuegen(lkw2);
		
		System.out.println("Gesamt-Einnahmen aus "  
		    + FahrzeugBestand.getAnzahlFahrzeuge()   + " Fahrzeug:  "
			+ FahrzeugBestand.berechneGesamtEinnahmen()	
				);
		System.out.println("Anzahl an PKWs in Bestand:" + FahrzeugBestand.getAnzahlPKWs());
	
	}

}
