package proramme;
import klassen.Auto;

public class AutoProgramm {
	
	public static void main(String[]args) {
	
	
		Auto bmw = new Auto(-100, "BMW");
		Auto audi = new Auto(150, "Audi");
				
		// Punkt-Notation
		
		bmw.tunen(25);
	Auto.erstellteAutos = 5 ;
		
		//System.out.println(bmw.getLeistung());
		//System.out.println(audi.getLeistung());
		//System.out.println(bmw.getHersteller());
		Auto.printInfos(bmw);
		System.out.println();
	    Auto.printInfos(audi);
	}


}
