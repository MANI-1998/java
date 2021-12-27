package string_functions;

public class Mutable {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("dhoni");

		System.out.println(System.identityHashCode(s));
		
		StringBuffer s1 = new StringBuffer("dhoni");

		System.out.println(System.identityHashCode(s1));
		
		
		//for append the memory will be shared
		StringBuffer append = s.append(s1);
		System.out.println(System.identityHashCode(append));
		//see the console two dhoni was reversed
		//it is because the above append of s was reversed
		s.reverse();
		System.out.println(s);
	}

}
