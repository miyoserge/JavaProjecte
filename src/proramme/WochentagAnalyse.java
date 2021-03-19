package proramme;

import enums.Wochentag;

public class WochentagAnalyse {
	
	public static void main(String[] args) {
		
		Wochentag montag = Wochentag.MONTAG;
		Wochentag mittwoch = Wochentag.MITTWOCH;
		Wochentag freitag = Wochentag.FREITAG;
		analysiereWochentag(montag);
		analysiereWochentag(mittwoch);
		analysiereWochentag(freitag) ;
		
	}

	
	private static void analysiereWochentag(Wochentag tag) {
		System.out.println(tag.toString() + "ist:   ");
		if(tag.toString().equals("MONTAG")) {
			System.out.println("Schlimm!");
		}else if(tag.toString().equals("FREITAG")){
			System.out.println("Toll!");
		} else if( tag.toString().equals("SAMSTAG")) {
			System.out.println("Super!");
		} else if(tag.toString().equals("SONNTAG")) {
			System.out.println("Ziemlich gut!");
		} else {
			System.out.println("So la la....");
			
		}
		
	}
}
