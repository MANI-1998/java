package exceptions;

public class Arithmetic_Exception {

	public static void main(String[] args) {
		// the below program will throw arithmetic exception in the console
		// bcoz we cannot divide 10 by 0
		// anything divide by 0 in java it will throw arthimetic exception
		 int a = 10;
		 System.out.println(a/0);

		// the below program will print infinity
		// bcoz it is in decimal
		// while giving in int it will throw arithmetic exception
		// but if we give decimal it will print infinity
//		double a = 10.0;
//		System.out.println(a / 0);

	}

}