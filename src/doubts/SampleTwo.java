package doubts;

import java.util.ArrayList;

public class SampleTwo {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(9); // 0
		al.add(7); // 1
		al.add(5); // 2
		al.add(6); // 3
		al.add(4); // 4
		
		System.out.println(al);
		
		al.add(8); // 5
		
		System.out.println(al);
		
		System.out.println(al.get(3));
		

	}

}
