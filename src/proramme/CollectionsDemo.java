package proramme;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionsDemo {
	public static void main(String[] args)  {
		List<Integer> list = new LinkedList<Integer>();
		list.add(12) ;
		list.add(20) ;
		list.add(1, 10) ;
		System.out.println(list.get(2));
		System.out.println(list.size());
		//System.out.println(list.contains(12));
		list.remove(12) ;
		System.out.println(list.size());
		
		for(int i : list) {
			System.out.println(i);
		}
		
		Set<String> set = new HashSet<String>() ;
		System.out.println(set.add("Text "));
		System.out.println(set.add("Noch ein Text "));
		System.out.println(set.size());
		
		
	}

}
