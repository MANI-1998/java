package scanner_concepts;

import java.util.Scanner;

public class Rough_Scanner {
	
	public static void main(String[] args) {
		Scanner rs = new Scanner(System.in);
		
		System.out.println("ENTER THE STUDENT ID");
		
		int nextInt = rs.nextInt();
		System.out.println(nextInt);
		
		System.out.println("------------------------");
		
		System.out.println("ENTER THE NAME");
		
		String next = rs.next();
		System.out.println(next);
		
		System.out.println("---------------------------");
		
		System.out.println("ENTER THE MARK 1");
		int m1 = rs.nextInt();
		System.out.println(m1);
		
		System.out.println("ENTER THE MARK 2");
		int m2 = rs.nextInt();
		System.out.println(m2);
		
		System.out.println("ENTER THE MARK 3");
		int m3 = rs.nextInt();
		System.out.println(m3);
		
		System.out.println("ENTER THE MARK 4");
		float m4 = rs.nextFloat();
		System.out.println(m4);
		
		System.out.println("ENTER THE MARK 5");
		float m5 = rs.nextFloat();
		System.out.println(m5);
		
		System.out.println("-------------------------");
		
		System.out.println("SUM OF ALL MARKS");
		
		float sum;
		
		sum = m1+m2+m3+m4+m5;
		
		System.out.println("total :" + sum);
		
		System.out.println("-------------------------");
		
		System.out.println("AVERAGE OF ALL MARKS");
		
		float average;
		
		average=sum/5;
		
		System.out.println("average :" + average);
		
		
	}

	

}
