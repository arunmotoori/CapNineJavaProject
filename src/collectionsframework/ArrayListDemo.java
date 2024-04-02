package collectionsframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<Integer> alist = new ArrayList<>();
		
		//Indexing - Order is preserved, Duplications are allowed, normal for loop
		alist.add(9); // 0
		alist.add(7); // 1
		alist.add(5); // 2
		alist.add(8); // 3
		alist.add(6); // 4
		alist.add(2); // 5
		alist.add(4); // 6
		alist.add(1); // 7
		alist.add(3); // 8
		alist.add(9); // 9
		
		System.out.println(alist);
		
		int m = Collections.min(alist);
		System.out.println(m);
		
		int ma = Collections.max(alist);
		System.out.println(ma);
	
		Collections.sort(alist);
		
		int i = Collections.binarySearch(alist,8);
		System.out.println(i);
		
		Collections.shuffle(alist);
		
		System.out.println(alist);
		
		Collections.reverse(alist);
		
		System.out.println(alist);
		
		Collections.sort(alist);
		
		System.out.println(alist);
		
		System.out.println("-----------------------------");
		
		Iterator<Integer> itr = alist.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		
		/*
		for(Integer e : alist) {
			
			System.out.println(e);
			
		}*/
		
		/*
		for(int i=0;i<alist.size();i++) {
			
			System.out.println(alist.get(i));
			
		}*/
		
		/*
		System.out.println(alist.get(0));
		System.out.println(alist.get(1));
		System.out.println(alist.get(2));
		System.out.println(alist.get(3));
		System.out.println(alist.get(4));
		System.out.println(alist.get(5));
		System.out.println(alist.get(6));
		System.out.println(alist.get(7));
		System.out.println(alist.get(8));
		*/
		
		
		
		
		
	}

}
