package variables_concepts;

public class Local_Variable_1 {
	
	public void multi() {
		int a=15;
		int b=a;
        System.out.println(b);
	}
	
	public static void main(String[] args) {
		Local_Variable_1 s = new Local_Variable_1();
		s.multi();
	}

}
