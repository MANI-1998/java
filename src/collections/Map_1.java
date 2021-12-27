package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_1 {
	public static void main(String[] args) {

		Map<Integer, String> li = new HashMap<Integer, String>();

		li.put(1, "java");
		li.put(2, "coffee");
		li.put(3, "java");
		li.put(4, null);

		System.out.println(li);

		int size = li.size();
		System.out.println(size);

		String oo = li.get(2);
		System.out.println(oo);

		Set<Integer> ke = li.keySet();
		System.out.println(ke);

		Collection<String> values = li.values();
		System.out.println(values);

		Set<Entry<Integer, String>> entry = li.entrySet();
		System.out.println(entry);

		li.remove(2);
		System.out.println(li);
		
	}

}
