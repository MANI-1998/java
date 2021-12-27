package com.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Col {

	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<Integer>();

		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);

		java.util.Iterator<Integer> iterator = li.iterator();

		System.out.println("forward");
		for (int i = 0; i < 5; i++) {

			Integer next = iterator.next();
			System.out.println(next);
			
		}
		
		ListIterator<Integer> listIterator = li.listIterator();

		System.out.println("reverse");
		for (int j = 0; j < 5; j++) {
			
			Integer next = listIterator.next();
			System.out.println(next);
		
		Integer previous = listIterator.previous();
		System.out.println(previous);

		}
	}
}