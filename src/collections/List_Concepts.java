package collections;

import java.util.ArrayList;
import java.util.List;

public class List_Concepts {
	//the generic symbol will support in version 1.8 above
	// below two line is for collection
	// for modifying we need not take return type
	// but for getting values we need return type
	public static void main(String[] args) {
		// collection represents a single unit of objects
		// it prints in insertion order
		// it allows duplicate values
		// it doesnt have any fixed length

		List<Integer> l = new ArrayList<Integer>();
		// in this we can use only integer bcoz the wrapper class is integer
		// we cannot use char string double float
		l.add(33);
		l.add(12);
		l.add(19);
		l.add(33);
		l.add(18);
		l.add(17);
		System.out.println(l);

		List<Object> li = new ArrayList<Object>();
		// in this we can use any data type bcoz the wrapper class is object
		// we can use all data types
		li.add(33);
		li.add(1.2);
		li.add("19");
		li.add(10);
		li.add(18);
		li.add(true);
		System.out.println(li);

		// the below size is used to get the length of the li
		int size = li.size();
		System.out.println(size);
		// the below size is used to get the length of the l
		int size2 = l.size();
		System.out.println(size2);

		// the below return type is object
		// see the wrapper class
		// why means in return type object only we can get any datatype
		// if the return type is integer we can only get int data type
		// list is a index based
		Object object = li.get(2);
		System.out.println(object);

		// the below return type is integer
		// why means the l is integer
		// see the wrapper class
		Integer integer = l.get(4);
		System.out.println(integer);

		// the below method is set it means it will replace the value
		// the value of 2 is 19 it has been replaced to string
		li.set(2, "string");
		System.out.println(li);

		l.set(1, 100);
		System.out.println(l);

		// it will remove the given value alone
		// the below given value is 2 so it has been removed
		li.remove(2);
		System.out.println(li);

		l.remove(1);
		System.out.println(l);

		// if we give the value it will give the length in the console
		// i had given the value as 33
		// it is in the first line so it is printed as o
		int indexOf = l.indexOf(33);
		System.out.println(indexOf);

		int indexOf2 = li.indexOf(10);
		System.out.println(indexOf2);

		// the below program denotes the difference between the index of and last index
		// of
		List<Object> li1 = new ArrayList<Object>();
		li1.add(10);
		li1.add(20);
		li1.add(30);
		li1.add(10);

		int indexOf3 = li1.indexOf(10);
		System.out.println(indexOf3);
		int lastIndexOf = li1.lastIndexOf(10);
		System.out.println(lastIndexOf);

		// the contains check wheather the value is present or not and print true or
		// false
		// the value given below is 10 and it is present in the l
		// so it is printed as true
		boolean contains = l.contains(10);
		System.out.println(contains);

		boolean contains2 = li.contains(true);
		System.out.println(contains2);

		List<Object> li2 = new ArrayList<Object>();
		li2.add(10);
		li2.add(20);
		li2.add(30);
		li2.add(10);

		// it will clear all the value and print
		li2.clear();
		System.out.println(li2);

		// it will just merge both the values and print in the console
		// li and l has been merged
		//object reference name must be given first
		li.addAll(l);
		System.out.println(li);

		List<Object> a1 = new ArrayList<Object>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);

		List<Object> a2 = new ArrayList<Object>();
		a2.add(70);
		a2.add(60);
		a2.add(50);
		a2.add(40);

		// it is like intersection
		// it will see the common values in both a1 and a2
		// the common values in a1 and a2 is 40
		// so it is printed
		a2.retainAll(a1);
		System.out.println(a2);

		List<Object> a3 = new ArrayList<Object>();
		a3.add(10);
		a3.add(20);
		a3.add(30);
		a3.add(40);

		List<Object> a4 = new ArrayList<Object>();
		a4.add(70);
		a4.add(60);
		a4.add(50);
		a4.add(40);

		// it will see the common value and remove the value
		// in this the common value in a3 and a4 is 40
		// it has removed and remaining values are printed
		a3.removeAll(a4);
		System.out.println(a3);

		// it will print the values in the ascending order
		// it is integer based
		// we cannot use for string
		//we cannot use this for object wrapper class it will through 
		//ClassCastException
		a4.sort(null);
		System.out.println(a4);

		// it will check wheather the li and l is empty or not
		// in this it has values so it print as false
		boolean empty = li.isEmpty();
		System.out.println(empty);

		boolean empty2 = l.isEmpty();
		System.out.println(empty2);
	}

}
