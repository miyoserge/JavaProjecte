package proramme;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {
	
	public static void main(String[] args) throws FileNotFoundException {
		try {
		//Object o = null ;
		//o.toString() ;
		//  ...
		checked() ;
		} catch (NullPointerException e) {
			System.out.println("NPE!");
		}
		finally {
			System.out.println("FINALLY");
		}
		
		
		
	}
	
	
	static void checked() throws FileNotFoundException {

		FileReader r = new FileReader(new File("C:/xxxxxxx.doc")) ;
	
	  
	
	throw new NullPointerException() ;
	}
	
	static void dateiAnlegen(String pfad) {
	boolean dateiExistiert = true ;  // ....	
		
		
		
		// Code, der die DAtei anlegt  hier......
		
	}
}
