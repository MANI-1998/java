package abstraction_concepts_2;

public class State extends Central {

	@Override
	public void ratan_tata() {
		System.out.println("TATA");
		
	}

	@Override
	public void ambani() {
		System.out.println("REIANCE");
		
	}
	public static void main(String[] args) {
		State ind = new State();
		ind.gst();
		ind.pm();
		ind.mp();
		ind.ratan_tata();
		ind.ambani();
	}
	
	

}

