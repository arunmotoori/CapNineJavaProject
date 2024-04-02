package collectionsframework;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Collection<Integer> set = new HashSet<>();
		
		set.add(9);
		set.add(7);
		set.add(5);
		set.add(1);
		set.add(8);
		set.add(2);
		set.add(9);
		set.add(3);
		set.add(6);
		set.add(22);
		set.add(99);
		set.add(121);
		set.add(9);
		
		Iterator<Integer> itr = set.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		
		/*
		for(Integer e: set) {
			System.out.println(e);
		}*/
		

	}

}
