package exceptions;

import java.util.Scanner;

public class Throws {
	// parent class of exception is throwable
	// to throw more exception
	// we need to change to below line

	//user defined exception
	public static void main(String[] args) throws InterruptedException  {
		System.out.println("enter the age");
		Scanner sc = new Scanner(System.in);

		int age = sc.nextInt();

	Thread.sleep(age);

		if (age >= 18) {
			System.out.println("elegible to vote");
		} else {
			throw new NullPointerException("not elegible to vote");
		}

	}
}
