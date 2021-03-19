package proramme;

public class SummeProgramm {
	public static void main(String[] args) {
		
		String zahl = args[0] ;
		 int z = Integer.parseInt(zahl) ;
		long ergebnis = berechneSumme(z);
		
		System.out.println();
		
		
	}
	
	static long berechneSumme(int zahl) {
		if(zahl == 1) {
			return 1 ;
		}
		return zahl + berechneSumme(zahl - 1) ;
	}

}
