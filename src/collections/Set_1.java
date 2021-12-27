package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_1 {

	public static void main(String[] args) {

		Set<Integer> li = new TreeSet<Integer>();

		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(10);

		System.out.println(li);

		int size = li.size();
		System.out.println(size);

		Set<Object> lo = new TreeSet<Object>();

		lo.add("java");
		lo.add(1234);
		lo.add(10);
		lo.add(30);
		lo.add(12.235f);
		lo.add(1234);
		lo.add(true);

		System.out.println(lo);
	
		li.removeAll(lo);
		System.out.println(li);

		boolean empty = li.isEmpty();
		System.out.println(empty);

		li.removeAll(lo);
		System.out.println(li);

		lo.retainAll(li);
		System.out.println(lo);

		lo.addAll(li);
		System.out.println(lo);

		int size1 = lo.size();
		System.out.println(size1);

		boolean contains = lo.contains(null);
		System.out.println(contains);

		li.clear();
		System.out.println(li);

	}

}
