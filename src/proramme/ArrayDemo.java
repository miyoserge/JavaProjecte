package proramme;

public class ArrayDemo {
    public static void main(String[] args) {
    	System.out.println(args.length);
    	
    	int x = 10;
    	int[] intArray = new int[3];
	    intArray[0] = 5 ;
	    intArray[1] = 15 ;
	    intArray[2] = 24 ;
	    
	    intArray = new int[] {5, 5, 23, 234, 234, 12 } ;
    	
	    String [][] zweiDimArray = new String[2][3] ;
	    
	    zweiDimArray[0][0] = "Hans" ;
	    zweiDimArray[0][1] = "Müller" ;
	    zweiDimArray[0][2] = "555 333" ;
	    
	    zweiDimArray[1][0] = "Hans" ;
	    zweiDimArray[1][2] = "Hans" ;
	    
  }
}
