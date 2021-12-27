package abstraction_concepts_1;

public abstract class Govern {
	//NON ABSTRACT METHOD
	public void engine() {
		System.out.println("200cc");
	}
	public void disc() {
		System.out.println("ABS");
	}
	public void speed() {
		System.out.println("145km/hr");
	}
	public void tyre() {
		System.out.println("R17");
	}
	// ABSTRACT METHOD
	public abstract  void toy(int a) ;
	public abstract void model();
	public abstract void colour();
	
	
	
	
	
	
	
	
	
	
	

}
