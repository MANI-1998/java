package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_HashSet {
	
	
public static void main(String[] args) {
		
		Set<Integer> l = new LinkedHashSet<Integer>();
		//it prints in insertion order
		//it will not allow duplicate value
		//it will allow single null value but will not allow duplicate null value
		l.add(10);
		l.add(20);
		l.add(null);
		l.add(null);
		
		System.out.println(l);
		
		Set<Object> li = new LinkedHashSet<Object>();
		
		li.add("well");
		li.add(null);
		li.add(1.2);
		
		System.out.println(li);
		
		int size = l.size();
		System.out.println(size);
		
		int size2 = l.size();
		System.out.println(size2);
		
		boolean contains = l.contains(10);
		System.out.println(contains);
		
		boolean contains2 = li.contains(null);
		System.out.println(contains2);
		
		l.clear();
		System.out.println(l);
		
		li.clear();
		System.out.println(li);
		
		
		Set<Object> a1 = new LinkedHashSet<Object>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		
		Set<Object> a2 = new LinkedHashSet<Object>();
		a2.add(70);
		a2.add(60);
		a2.add(50);
		a2.add(40);
		
		a1.addAll(a2);
		System.out.println(a1);
		
		Set<Object> a3 = new LinkedHashSet<Object>();
		a3.add(10);
		a3.add(20);
		a3.add(30);
		a3.add(40);
		
		Set<Object> a4 = new LinkedHashSet<Object>();
		a4.add(70);
		a4.add(60);
		a4.add(50);
		a4.add(40);
		
		a3.retainAll(a4);
		System.out.println(a3);
		
		Set<Object> a5 = new LinkedHashSet<Object>();
		a5.add(10);
		a5.add(20);
		a5.add(30);
		a5.add(40);
		
		Set<Object> a6 = new LinkedHashSet<Object>();
		a6.add(70);
		a6.add(60);
		a6.add(50);
		a6.add(40);
		
		a5.removeAll(a6);
		System.out.println(a5);
		
		
		boolean empty = a5.isEmpty();
		System.out.println(empty);
		
		
		
		
		
	}

}
