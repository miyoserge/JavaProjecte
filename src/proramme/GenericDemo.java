package proramme;
import java.util.Map;

import klassen.ArrayUtils;
import klassen.Fahrzeug;
import klassen.FahrzeugListe;
import klassen.Liste;
import klassen.Motorrad;
import klassen.PKW;
public class GenericDemo {

	public static void main(String[] args) {
		// ---------------Liste von Fahrzeugen -------------------
		Liste<Fahrzeug> fahrzeugListe = new Liste<Fahrzeug>(100) ;
		
		fahrzeugListe.add(new PKW(180, "BMW", 33000, 5));
		fahrzeugListe.add(new Motorrad(110, "Suziki", 14500));
		
		System.out.println("Fahrzeuge in Liste:"
				+ fahrzeugListe.getElementCount());
		Fahrzeug f = (Fahrzeug)fahrzeugListe.get(1) ;
		System.out.println(f);
		
		// ------------------ Liste von Strings -----------------------
		
		Liste<String> herstellerListe = new Liste<String>(25) ;
		
		herstellerListe.add("Audi");
		herstellerListe.add("BMW");
		herstellerListe.add("Citroen");
		
		System.out.println("Hersteller in Liste: "
				+ herstellerListe.getElementCount());
		
		String hersteller = herstellerListe.get(2) ;
		System.out.println(hersteller);
		
		//Mapping
	//Map<String, String> map = new Map<String, String>() ;
		Liste<String> liste = ArrayUtils.<String>arrayToList(new String[] {"Hallo", "Hi" } );
		
		// Fahrzeug Liste
		FahrzeugListe<PKW> list = new FahrzeugListe<PKW>(100) ;
		
		String o = new String() ;
		Object objListe = new Liste<Object>(100) ;
		Liste<String> strListe = new Liste<String>(100) ;
		objListe = strListe ;
		((Liste<Fahrzeug>) objListe).add(new Object());
		
	}
	
}
