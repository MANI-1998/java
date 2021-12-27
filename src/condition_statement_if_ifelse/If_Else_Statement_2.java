package condition_statement_if_ifelse;

import java.util.Scanner;

public class If_Else_Statement_2 {
	public static void main(String[] args) {
		System.out.println("enter your age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if (age>=18) {
			System.out.println("elegible to vote");
		} else {
              System.out.println("not eligible to vote");
		}
		
		
	}
	
	
	
	

}
