package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class List_1 {
	public static void main(String[] args) {
		// generics - type safety

		List<Integer> li = new ArrayList<Integer>();

		li.add(50);
		li.add(20);
		li.add(30);
		li.add(10);

		System.out.println(li);
		
		
		Collections.sort(li);
		System.out.println(li);
		
		List<String> name = new ArrayList<String>();
	
		name.add("mani");
		name.add("mathu");
		name.add("tina");
		name.add("abi");
		name.add("mithran");
		
		
		Collections.sort(name);
		System.out.println(name);
		

		List<Object> lo = new LinkedList<Object>();

		lo.add("java");
		lo.add(1234);
		lo.add(10);
		lo.add(null);
		lo.add(12.235f);
		lo.add(1234);
		lo.add(true);
		
		System.out.println(lo);
		
		lo.sort(null);
		System.out.println(lo);
		
		
		
		
		
		

		boolean empty = lo.isEmpty();
		System.out.println(empty);

		lo.retainAll(li);
		System.out.println(lo);

		li.removeAll(lo);
		System.out.println(li);

		lo.addAll(li);
		System.out.println(lo);

		lo.clear();
		System.out.println(lo);

		boolean contains = lo.contains(1234);
		System.out.println(contains);

		int indexOf = lo.indexOf(true);
		System.out.println(indexOf);

		lo.remove(1);
		System.out.println(lo);

		lo.set(3, false);
		System.out.println(lo);

		Object object = lo.get(4);
		System.out.println(object);

		int size = li.size();
		System.out.println(size);

		int size2 = lo.size();
		System.out.println(size2);

	}

}
