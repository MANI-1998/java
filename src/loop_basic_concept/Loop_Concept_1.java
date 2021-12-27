package loop_basic_concept;

public class Loop_Concept_1 {
	
	public static void main(String[] args) {
	// for loop
		//used to execute a set of instruction or fuction repeatedly when some condition becomes true
		//for (int i = 0; i <5; i++) {
		//	System.out.println("i");
		//}
		
		//nested loop
		//outer for loop
		for (int i = 0; i < 5; i++) {//i=i+1
			//inner for loop
			for (int j = 0; j < 5; j++) {//j=j+1
				//syso for inner for loop
				System.out.println(i+" "+j);
				
			}
			//syso for outer for loop
			System.out.println(i);
			
		}
		
		
		
		
		
	}
}
