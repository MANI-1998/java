package nested_for_loop;

public class Nested_For_Loop_1 {
	
	public static void main(String[] args) {
		//outer loop
		for (int i = 0; i <3 ; i++) {
			//inner loop
			for (int j = 0; j <3; j++) {
				//syso for inner loop
				System.out.println(i+" "+j);
			}
			//syso for outer loop
			System.out.println();
		}
	}
	
	

}
