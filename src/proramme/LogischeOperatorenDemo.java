package proramme;
import klassen.Auto;
public class LogischeOperatorenDemo {
	public static void main(String[] args) {
		// ! (Nicht )
		boolean b = true;
		System.out.println(!b);
		
		// &(Und)
		boolean b2 = false ;
		System.out.println(b & b2) ;
		
		// | (oder)
		System.out.println(b | b2);
		
		// ^ (exklusives oder )
		System.out.println( b ^ b2) ;
		Auto bmw = new Auto(200, "BMW") ;
		Auto audi = new Auto(120, "Audi") ;
		
		if(Auto.erstellteAutos == 2) {
			if(audi.getLeistung() < 100) {
				audi.tunen();
			}
			else if(audi.getLeistung() < bmw.getLeistung()) {
				audi.tunen();
			}
			
			
			// einfacher:
			
			if(Auto.erstellteAutos == 2 & (audi.getLeistung() < 100 | audi.getLeistung() < bmw.getLeistung() )  ) {
				
					audi.tunen();
				
			}		
			
			// Short Circuit Evaluation: && und ||
			
			int i = 10 ;
			int j = 15;
			if( i == 10 | j == 15) {
				// ...
			}
		}
	}

}