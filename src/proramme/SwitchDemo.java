package proramme;

public class SwitchDemo {
	
	public static final int STATUS_BEREIT = 1 ;
	public static final int STATUS_SORTE_WAEHLEN = 2 ;
	public static final int STATUS_AUSGABE = 3 ;
	public static final int STATUS_LEER = 4 ;
	
	public static void main(String[] args) {
		
		/*
		 * 1 = Bereit zum kauf eines Kaugummis
		 * 2 = Geld wurde eingeworfen
		 * 3 = Kaugummi wird ausgegeben
		 * 4 = Automat leer
		 * 5 = Systemfehler
		 * 
		 * */
		int status = 0 ;
		
		switch(status) {
		case STATUS_BEREIT: System.out.println("Bitte werfen Sie Geld ein.");
		break;
		case STATUS_SORTE_WAEHLEN: System.out.println("Wählen Sie die Sorte");
		break;
		case STATUS_AUSGABE: System.out.println("Kaugummi wird ausgegeben -bitte warten.....");
		break;
		case STATUS_LEER: System.out.println("Automat ist leer");	
		break;
		default: System.out.println("System-Fehler");	
		
		}
		
	/*
		if(status == 1) {
			System.out.println("Bitte werfen Sie Geld ein.");
		} 
		
		else if(status == 2) {
			System.out.println("Wählen Sie die Sorte");	
		}
		
		else if(status == 3) {
			System.out.println("Kaugummi wird ausgegeben -bitte warten.....");	
		}

		else if(status == 4) {
			System.out.println("Automat ist leer");	
		}

		else {
			System.out.println("System-Fehler");	
		}
*/
		
	}
}
