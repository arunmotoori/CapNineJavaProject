package collectionsframework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<String,Object> map = new HashMap<>();
		
		map.put("name","Arun");
		map.put("Experience",17);
		map.put("Location","Hyderabad");
		map.put("name","Varun");
		map.put("City","Hyderabad");
		
		System.out.println(map.get("Location"));
		System.out.println(map.get("Experience"));
		System.out.println(map.get("name"));
		System.out.println(map.get("City"));
	
		
		
		/*
		for(String s : map.keySet()) {
			
			System.out.println(s+" : "+map.get(s));
			
		}*/

	}

}
