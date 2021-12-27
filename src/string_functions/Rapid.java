package string_functions;

public class Rapid {
	public static void main(String[] args) {
		
//		String s = "i love Burger Burger";
//		String s1 = "i LOVE Burger";
//
//		int length = s.length();
//		System.out.println(length);
//		
//		boolean equals = s.equals(s1);
//		System.out.println(equals);
//		
//		boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
//		System.out.println(equalsIgnoreCase);
//		
//		String upperCase = s.toUpperCase();
//		System.out.println(upperCase);
//		
//		String lowerCase = s1.toLowerCase();
//		System.out.println(lowerCase);
//		
//		boolean startsWith = s.startsWith("i");
//		System.out.println(startsWith);
//		
//		boolean endsWith = s1.endsWith("er");
//		System.out.println(endsWith);
//		
//		boolean contains = s1.contains("LOVE");
//		System.out.println(contains);
//		
//		int indexOf = s.indexOf('u');
//		System.out.println(indexOf);
//		
//		int indexOf2 = s.indexOf("Burger");
//		System.out.println(indexOf2);
//		
//		int lastIndexOf2 = s.lastIndexOf('u');
//		System.out.println(lastIndexOf2);
//		
//		int lastIndexOf = s.lastIndexOf("Burger");
//		System.out.println(lastIndexOf);
//		
//		char charAt = s.charAt(5);
//		System.out.println(charAt);
//		
//		String replace = s.replace("Burger", "pizza");
//		System.out.println(replace);
//		
//		String replace2 = s.replace("Burger", "pizza");
//		System.out.println(replace2);
//		
//		String substring = s.substring(3);
//		System.out.println(substring);
//		
//		boolean empty = s.isEmpty();
//		System.out.println(empty);
//		
//		String[] split = s.split(" ");
//		for (String string : split) {
//			System.out.print(string);
//		}
//	System.out.println("-------------------------------------");
//		
		String s1 = "i LOVE Burger";
		
	    String s3 = " and pizza";
	
		String concat = s1.concat(s3);
		System.out.println(concat);
		
		//converting of data type int,double,float into string
		double a=2345.1234567;
		
		String valueOf = String.valueOf(a);
		System.out.println(valueOf);
		
		//converting of String into int,double,float
		String s4 = "12345";
		
		int parseInt = Integer.parseInt(s4);
		System.out.println(parseInt);
		
		
		
	}

}
