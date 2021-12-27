package abstraction_concepts_1;

public class Bajaj extends Govern {
	
	@Override
	public void model() {
		System.out.println("ns200");
		
	}
	
	@Override
	public void colour() {
		System.out.println("red");
		
		
	}
	public void toy(int a) {
		System.out.println("adult toys ;" + a);
		
	}
	public static void main(String[] args) {
		Bajaj bike = new Bajaj();
		bike.engine();
		bike.model();
		bike.disc();
		bike.colour();
		bike.tyre();
		bike.speed();
		bike.toy(18);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
