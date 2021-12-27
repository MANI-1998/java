package hierarchical_inheritance;

public class Child_1 extends Parent{
	
	public void food_1() {
		System.out.println("pizza");

	}
public static void main(String[] args) {
	Child_1 c1 = new Child_1();
	c1.food();
	c1.food_1();
}
}
