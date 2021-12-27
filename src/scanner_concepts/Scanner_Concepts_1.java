package scanner_concepts;
import java.util.Scanner;

public class Scanner_Concepts_1 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
	
		System.out.println("NAME");
		String a1 = p.next();
	//	System.out.println(a1);
		
		System.out.println("ROLL NO");
		int a2 = p.nextInt();
		System.out.println(a2);
		
		System.out.println("BLOOD GROUP");
		String a3 = p.next();
		System.out.println(a3);
		
		System.out.println("MOBILE NO");
		long a4 = p.nextLong();
		System.out.println(a4);
		
		System.out.println("PERCENTAGE OF MARKS");
		float a5 = p.nextFloat();
		System.out.println(a5);
		
		String a6 = p.nextLine();
		System.out.println(a6);
		
		System.out.println("DESCRIPTION");
		
		String a7 = p.nextLine();
		System.out.println(a7);
		
	
		
		
		
		
		
		
	
	}

}
