package klassen;

public class Liste<T> {
	
	private T[] array ;
	private int nextFreeSlot = 0 ;
	
	public Liste(int capacity) {
		array = (T[]) new Object[capacity] ;
	}
	
	public void add(Object object) {
		if(nextFreeSlot == array.length) {
			throw new IllegalStateException("Liste ist voll!") ;
		}
		array[nextFreeSlot] = (T) object ;
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

}
