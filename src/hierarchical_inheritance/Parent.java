package hierarchical_inheritance;

public class Parent  {

	public void food() {
		System.out.println("biriyani");

	}
	
	 public static void main(String[] args) {
		 Child_1 c1 = new Child_1();
		 Child_2 c2 = new Child_2();
		 Child_3 c3 = new Child_3 ();
	//all class extends the method of class d	
		c1.food();
		c2.food();
		c3.food();
		
	}
}
