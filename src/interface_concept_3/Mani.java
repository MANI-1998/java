package interface_concept_3;

public class Mani implements Dad,Mom {
	
	@Override
	public void watch1() {
		System.out.println("titan");
		
	}

	
	
	@Override
	public void watch2() {
		System.out.println("casio");
		
	}
	public static void main(String[] args) {
		Mani w = new Mani();
		w.watch1();
		w.watch2();
	}

}
