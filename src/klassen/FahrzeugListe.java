package klassen;

public class FahrzeugListe <T extends Fahrzeug>{
	private T[] array ;
	private int nextFreeSlot = 0 ;
	
	public FahrzeugListe(int capacity) {
		array = (T[]) new Object[capacity] ;
	}
	
	public void add(T o) {
		if(nextFreeSlot == array.length) {
			throw new IllegalStateException("Liste ist voll!") ;
		}
		array[nextFreeSlot] = o ;
		nextFreeSlot++ ;
	}
	
	public T get(int index) {
		return array[index] ;
	}
	
	public int getCapacity() {
		return array.length ;
	}
	
	public int getElementCount() {
		return nextFreeSlot ;
	}
	
	public int berechneEinnahmeen() {
		int summe = 0;
		for(T t : array) {
		summe += t.getPreis() ;	
		}
		return summe ;
	}

}
