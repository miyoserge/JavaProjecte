package proramme;

public class StringDemo {
public static void main(String[] args) {
	
	String hersteller  = new String("BMW") ;
	String hersteller2 = "BMW" ;
	
	System.out.println( hersteller == hersteller2 );
	String s = "Test" ;
	s.replaceAll(" s", "x") ;
	System.out.println(s);
   }
}
