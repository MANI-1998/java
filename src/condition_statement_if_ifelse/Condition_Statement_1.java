package condition_statement_if_ifelse;


import java.util.Scanner;

public class Condition_Statement_1 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			
		
		System.out.println("enter the marks");
		Scanner sc = new Scanner(System.in);
		int mark = sc.nextInt();
		
		if (mark<50) {
			System.out.println("fail");
		}else if (mark>=50 && mark<60) {
			System.out.println("d grade");
		}
		else if (mark>=60 && mark<70) {
			System.out.println("c grade");
		}
		else if (mark>=70 && mark<80) {
			System.out.println("b grade");
		}
		else if (mark>=80 && mark<90) {
			System.out.println("a grade");
		}
		else if (mark>=90 && mark<100) {
			System.out.println("s grade");
		}
		else {
			System.out.println("invalid");
		}
		
		
		}
		
	}
}
