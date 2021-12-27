package nested_for_loop;

public class Nested_For_Loop_2 {
	
   public static void main(String[] args) {
	for (int i = 0; i<6; i++) {//row
		for (int j = 0; j<i; j++) {//column
			System.out.print(j);
		}
		System.out.println(" ");
		System.out.println(i);
	}
}

}
