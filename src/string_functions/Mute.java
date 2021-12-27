package string_functions;

public class Mute {
	public static void main(String[] args) {

		StringBuffer s1 = new StringBuffer("toy");

		System.out.println(System.identityHashCode(s1));

		StringBuffer s2 = new StringBuffer("toy");

		System.out.println(System.identityHashCode(s2));

		StringBuffer append = s1.append(s2);
		System.out.println(append);
		System.out.println(System.identityHashCode(append));

		StringBuffer reverse = s1.reverse();
		System.out.println(reverse);
	}

}
