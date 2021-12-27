package string_functions;

public class Immutable {
	
	public static void main(String[] args) {
		
		//for duplicate it will share the memory
		//s and s1 have the same values int the "" [case sensitive]
		//so it shares the memory
		String s ="welcome to java";
		System.out.println(System.identityHashCode(s));
		
		String s1 ="welcome to java";
		System.out.println(System.identityHashCode(s1));
		
		//for concat it will create the new memory
		String concat = s.concat(s1);
		//s=s+s1;
		System.out.println(concat);
		System.out.println(System.identityHashCode(concat));
		
	}

}
