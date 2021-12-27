package keywords;

public class Static_Keyword_Concept_1 {
	
	static int a=10;
	
	
	public Static_Keyword_Concept_1() {
		System.out.println("constructor");
	}
	
	public void key() {
		System.out.println("method name");

	}
	
	static {
		System.out.println("static block");
	}
	
	public static void lock() {
		
		System.out.println("method level static");

	}
	
	public static void main(String[] args) {
		System.out.println("main method");
		Static_Keyword_Concept_1 s = new Static_Keyword_Concept_1();
		s.key();
		System.out.println(a);
		lock();
		
		
	}
}
