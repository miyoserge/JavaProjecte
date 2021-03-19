package proramme;

public class VarArgsDemo {
	public static void main(String[] args) {
	System.out.println(addiere(5, 6, 4, 12, 25, 26));	
	}

	
static int addiere(int ersteZahl, int zweiteZahl, int... weitereZahlen) {
	int ergebnis = ersteZahl + zweiteZahl;
	for(int z : weitereZahlen){
		ergebnis += z;
	}
	
	return ergebnis ;
	}

	
	
}
