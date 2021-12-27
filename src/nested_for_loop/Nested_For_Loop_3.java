package nested_for_loop;

public class Nested_For_Loop_3 {
	
	public static void main(String[] args) {
		
		for (int i = 9; i >1; i--) {//row
			
			for (int j = 1; j <i ; j++) {//column
				
				System.out.print("&");
			}
			
			System.out.println("+");
		}
		
		
		
	}
	

}
