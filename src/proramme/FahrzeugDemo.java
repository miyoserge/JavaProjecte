package proramme;

import klassen.Fahrzeug;
import klassen.PKW;


public class FahrzeugDemo {
	public static void main(String[] args) {
		
Fahrzeug f = new PKW(100,"Audi", 60000,5 )	;

f.tunen(-80);


System.out.println(f.getLeistung());	


PKW pkw = new PKW(100, "BMW", 19000, 5) ;
pkw.setAnzahlTueren(4);

pkw.tunen(79);

	

System.out.println(pkw.getLeistung());
	
	}
		
}
