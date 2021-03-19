package proramme;
import klassen.Auto;
public class VergleichsoperatorenDemo {
	public static void main(String[] args) {
		
		/*
		 * 
		 * <
		 * <=
		 * >
		 * >=
		 * ==
		 * !=
		 * 
		 * */
		
		int x = 6 ;
		int y = 3 ;
		
		boolean b = x < y ;
		System.out.println(b);
		
		boolean b2 = true == false;
		System.out.println(b2);
		boolean b3 = "Hallo" == "Ciao";
		
		Auto a1 = new Auto(100,"BMW");
		Auto a2 = new Auto(100, "BMW");
		System.out.println( a1 == a2 );
	}

}
