package string_functions;

public class Immute {
	public static void main(String[] args) {

		String s = "welcome to disney";
		System.out.println(System.identityHashCode(s));

		String s1 = "welcome to disney";
		System.out.println(System.identityHashCode(s1));

//		String concat = s.concat(s1);
//		System.out.println(concat);

		String s2 = s + s1;
		System.out.println(s2);
		System.out.println(System.identityHashCode(s2));

	}

}
