package hybrid_inheritance;

public class Class_d extends Class_A implements Class_b,Class_c {

	@Override
	public void cat() {
		System.out.println("black");
		
	}

	public static void main(String[] args) {
		Class_d h = new Class_d();
		h.cat();
		h.dog();
	}
	
	
}
