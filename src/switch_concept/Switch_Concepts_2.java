package switch_concept;

import java.util.Scanner;

public class Switch_Concepts_2 {
	
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			
		System.out.println("ENTER THE ID");
		
		Scanner sc = new Scanner(System.in);
		int hari=sc.nextInt();
		
	switch (hari) {
	case 312:
		System.out.println("lazy hari");
		break;
	case 311:
		System.out.println("topper hari");
		break;
	case 310:
		System.out.println("lazy mouth hari");
		break;
	case 309:
		System.out.println("lazy simple hari");
		break;

	default:
		System.out.println("INVALID HARI");
		break;
	}
		}
	
	
	
	
	}

}
