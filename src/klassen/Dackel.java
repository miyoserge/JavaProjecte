package klassen;

import Interface.Verkaeuflich;

public class Dackel  extends Hund implements Verkaeuflich{
	
	private int preis ;
	
	public Dackel(int preis) {
		this.preis = preis ;
	}
	
	@Override
	public int getPreis() {
		return 0 ;
	}

}
