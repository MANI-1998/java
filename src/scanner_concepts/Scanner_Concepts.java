package scanner_concepts;
import java.util.Scanner;

//WE CANNOT GIVE SCANNER ALONE AS A CLASS NAME SO WE GIVEN AS SCANNER_CONCEPTS

public class Scanner_Concepts {
     // void means no return type 
	//void is a keyword
	//return change value into method
	//we can convert the below three line into single line which is done after the object creation syntax
	//so the below return type is not needed just for reference we had noted
	//
      // public int add() {
		//int a = 34;
//return a;
	//}
	
	public static void main(String[] args) {
		Scanner_Concepts s = new Scanner_Concepts();
		
		//the below line is used to call the the return method but im noted just for reference
		//s.add();
		
		//SYNTAX FOR SCANNER
		//very important default syntax below line is compulsory syntax in scanner
		//obj name(sc) alone will change
		Scanner sc = new Scanner (System.in);
		
		System.out.println("ENTER THE NAME");
		String s1 = sc.nextLine();
		System.out.println(s1);
	    
		System.out.println("ENTER THE COMPANY NAME");
		String s2 = sc.nextLine();
		System.out.println(s2);
		
		System.out.println("ENTER THE EMPLOYEE NUMBER");
		int n = sc.nextInt();
		System.out.println(n);
		
		System.out.println("ENTER THE DESIGNATION");
		String next = sc.next();
		System.out.println(next);
		
		System.out.println("ENTER THE MOBILE NO");
		long s3 = sc.nextLong();
		System.out.println(s3);
	     //i had typed java programming in the console for next but it had printed only java
		//it accepts only one value
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
	
	
	
	
	
	
	
	
	
	
	
}
