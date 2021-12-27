package condition_statement_if_ifelse;

import java.util.Scanner;

public class If_Else_Statement_3 {
	
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
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

}
