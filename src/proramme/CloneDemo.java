package proramme;
import klassen.Motorrad;
import klassen.Spielstand;

public class CloneDemo {
	
	 
	 
	 static Spielstand aktuellerSpielStand ;
	 static Spielstand gesicherterSpielstand ;
	 
	 public static void main(String[] args) {
		 
		 
		 aktuellerSpielStand = new Spielstand()		 ;
		 aktuellerSpielStand.punkte = 1000 ;
		 aktuellerSpielStand.fahrzeug = new Motorrad(120, "Suzuki", 13900) ;
		 
		 // ..... Spieler spielt .....
		 
		 sichereSpielstand() ;
		 zeigeSpielstaende() ;
		 
		 aktuellerSpielStand.punkte = 1500 ;
		 aktuellerSpielStand.fahrzeug.tunen(200);
		 
		 zeigeSpielstaende() ;

	}
	
	static void sichereSpielstand() {
		//TODO: Aktuellen Spielstand klonen und als gesicherten Spielstand
		// speiche
		Spielstand klon = aktuellerSpielStand.clone() ;
		gesicherterSpielstand = klon ;
	}
	
	static void ladeSpielstand() {
		aktuellerSpielStand =  gesicherterSpielstand ;
	}

	static void zeigeSpielstaende() {
		System.out.println("Aktuell: " + aktuellerSpielStand );
		System.out.println("Gesichert: " + gesicherterSpielstand );
	}
}
