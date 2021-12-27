package exceptions;

import java.util.Scanner;

public class Throw {
	
	//user defined exception
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the age");
		int age = sc.nextInt();
		
		if (age>=18) {
			System.out.println("elegible to vote");
		}else {
			throw new ArithmeticException ("not elegible to vote");
		}
		
		
		
		
		
		
	}

}
