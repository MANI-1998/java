package variables_concepts;

public class Static_Variable {
	
	
	static int a=123;
	static int b=456;
	static int c=789;
	static int d=c;
	public static void add() {
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}
public static void main(String[] args) {
	add();
	System.out.println(a);
}
}
