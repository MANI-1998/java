package switch_concept;

import java.util.Scanner;

public class Switch_Concepts_1 {

	// switch should not be used in for loop
	// break is used to cut the flow
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("ENTER THE TELECOM NAME");

			Scanner sc = new Scanner(System.in);
			String telecom = sc.nextLine();

			switch (telecom) {
			case "JIO":
				System.out.println("NO.1");
				break;
			case "AIRTEL":
				System.out.println("NO.2");
				break;
			case "VI":
				System.out.println("NO.3");
				break;
			case "BSNL":
				System.out.println("NO.4");
				break;

			default:
				System.out.println("NOT A TELECOM");
				break;
			}
		}
	}
}
