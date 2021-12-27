package collections;

import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {
	
	 
	  //it prints in ascending  order
      //it will not allow duplicate value
	  //it will not allow single null value
	  //if i give null it will throw null point exception in console
	
	public static void main(String[] args) {
		
		Set<Integer> l = new TreeSet<Integer>();
		//the below line is null point exception
		//l.add(null);
		//System.out.println(l);
		
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		
		System.out.println(l);
		
		int size = l.size();
		System.out.println(size);
		
		boolean contains = l.contains(30);
		System.out.println(contains);
		
		l.clear();
		System.out.println();
		//we cannot give object in a1.add("mani"); it will throw class cast exception
		Set<Object> a1 = new TreeSet<Object>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		
		Set<Object> a2 = new TreeSet<Object>();
		a2.add(70);
		a2.add(60);
		a2.add(50);
		a2.add(40);
		
		a1.addAll(a2);
		System.out.println(a1);
		
		Set<Object> a3 = new TreeSet<Object>();
		a3.add(10);
		a3.add(20);
		a3.add(30);
		a3.add(40);
		
		Set<Object> a4 = new TreeSet<Object>();
		a4.add(70);
		a4.add(60);
		a4.add(50);
		a4.add(40);
		
		a3.retainAll(a4);
		System.out.println(a3);
		
		Set<Object> a5 = new TreeSet<Object>();
		a5.add(10);
		a5.add(20);
		a5.add(30);
		a5.add(40);
		
		Set<Object> a6 = new TreeSet<Object>();
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
