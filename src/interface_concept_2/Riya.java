package interface_concept_2;

public class Riya implements SR,Mathu{

	@Override
	public void toy2() {
		System.out.println("car");
		
	}

	@Override
	public void food2() {
		System.out.println("pizza");
		
		
	}

	@Override
	public void toy1() {
		System.out.println("bike");
		
		
	}

	@Override
	public void food1() {
		System.out.println("burger");
		
	}
	public static void main(String[] args) {
		Riya daughter = new Riya();
		daughter.food1();
		daughter.food2();
		daughter.toy1();
		daughter.toy2();
	}

	
	
}
