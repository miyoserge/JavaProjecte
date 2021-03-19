package proramme;

public class CodeLabelDemo {
	public static void main(String[] args) {
		
		
		meinLabel: for(int k = 0 ; k < 10 ; k++){
			System.out.println("Test 1");
			int i = 3 ;
			if (i == 1) {
				break meinLabel ;
			}
			
			System.out.println("Test 2");
		}
		
		
		
	}

}
