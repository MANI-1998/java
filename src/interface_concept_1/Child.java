package interface_concept_1;

public class Child implements Parent1,Parent2 {

	@Override
	public void gift2() {
		System.out.println("ns 200");
		
	}

	@Override
	public void gift1() {
		System.out.println("rs 200");
		
	}
	
	public void toy() {
		System.out.println("car");

	}
public static void main(String[] args) {
	Child bike = new Child();
			bike.gift2();
			bike.gift1();
			bike.toy();
}
}
