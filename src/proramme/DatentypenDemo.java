package proramme;
import java.awt.Color;

import klassen.Auto;
public class DatentypenDemo {
	public static void main(String[] args) {
		
		//primitive Datentypen
		int i = 25 ;
		System.out.println(Integer.MIN_VALUE);
		long l = 500000000000L ; // Long
		short s = 50;
		byte b = 20 ;
		double d = 2.5345983 ;
		float f = 2.5F;
		char c = 'A' ;
		boolean bool = false;
		
		// Komplexe Datentypen:
		
		Auto a = new Auto("Audi");
		String st = "Hallo" ;
		Color h = new Color(255,0,0);
		
		
	}
}