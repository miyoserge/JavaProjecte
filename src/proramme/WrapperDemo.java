package proramme;

import klassen.Liste;

public class WrapperDemo { // Klasse für primitive Datentypen und zum Verpacken
	public static void main(String[] args) {
		
		// Integer, Character, Byte, Short, Long, Float, Double, Boolean
		
		Integer integer = new Integer("100");
	int i = integer.intValue() ;

	Liste<Integer> liste = new Liste<Integer>(100) ;
	liste.add(25);
    i = liste.get(0) ;
    
    Double d1 = new Double(2.3) ;
    Double d2 = new Double(1.7) ;
    Double d3 = d1 + d2 ;
    
    Integer i1 = new Integer(50) ;
    Integer i2 = new Integer(50) ;
    
    System.out.println(i1 == i2);
    
    // BigInteger, BigDecimal
    
    for(double d = 0; d < 1.0; d+= 0.1) {
    	System.out.println(d);
      }
    
    
	}
	
}
