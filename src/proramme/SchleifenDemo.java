package proramme;

import java.util.Random;

public class SchleifenDemo {
	public static void main(String[] args) {
		
		// For-schleife
		int max = 10;
		 /*
		for(int i = 1 ; i <= max ; i++) {
			System.out.println(i + ". Schleifendurchlauf");
		}
		*/
		
		// ...
		int[] potenzen = new int[20];
		for(int i = 0; i < potenzen.length; i++) {
			int zahl = (int)Math.pow(2, i+1);
			System.out.println(zahl);
			potenzen[i] = zahl ;
		}
		
		// for-Each Schleife
		for(int i : potenzen) {
			System.out.println(i);
		}
		
		// while-Schleife
		Random r = new Random() ;
		int zahl = r.nextInt(6) + 1 ;
		System.out.println( "zahl ist: "  + zahl );
		
		
		while(zahl != 6) {
	
		    zahl = r.nextInt(6) + 1 ;
			System.out.println( "zahl ist: "  + zahl );

		}
		
		int[][] zweiDimArray = new int[3][];
		
		zweiDimArray[0] = new int[12];
		zweiDimArray[1] = new int[8];
		zweiDimArray[2] = new int[65];
		for(int i = 0; i < zweiDimArray.length; i++) {
			for(int j = 0 ; j < zweiDimArray[i].length; j++) {
				zweiDimArray[i][j] = 5 ;
			}
			
		}
	}

}
