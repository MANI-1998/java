package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Concepts {
	//map is a separated interface
	//it is a key and value pair
	
	//key
	//it will not allow duplicate value
	//it will override duplicate value
	
	//value
	//it will allow duplicate value
	
	public static void main(String[] args) {
		
		Map<Integer,String> m = new HashMap<Integer, String>();
		//key,value
		m.put(1, "java");
		m.put(2, "python");
		m.put(6, "selenium");
		m.put(4, "framework");
		m.put(5, "swiftui");
		m.put(3, "java");
		//m.put(1, "constructor");
		
		System.out.println(m);
		
		int size = m.size();
		System.out.println(size);
		
		//it is not index based 
		//it is value based
		String string = m.get(4);
		System.out.println(string);
		
		
		boolean containsKey = m.containsKey(5);
		System.out.println(containsKey);
		
		
		boolean containsValue = m.containsValue("java");
		System.out.println(containsValue);
		
		//see the console it is printed in [] 
		//bcoz it is converted into set from map
		//while taking return type
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		
		
		//see the console it is printed in [] 
	    //bcoz it is converted into set from collections
		//while taking return type
		Collection<String> values = m.values();
		System.out.println(values);
		
		//it will convert entire map program to set
		//to use other set methods
		//we can convert only to set
		//we cannot convert to list
		//bcoz list is a index based
		//map is a value based
		
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		System.out.println(entrySet);
		
		//the below method cannot be used in map
		//but after using entry set method
		//it  is converted into set
		//so the other methods can be used
		m.remove(3);
		System.out.println(m);
		
		
	}
	
	

}
