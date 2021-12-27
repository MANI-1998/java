package abstraction_concepts_3;

public class Yamaha extends Government{

	@Override
	public void model() {
		System.out.println("v4");
		
		
	}

	@Override
	public void color() {
		System.out.println("rainbow");
		
	}
	public static void main(String[] args) {
		Yamaha bike = new Yamaha();
		
		bike.color();
		bike.model();
	}

}
